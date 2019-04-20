package com.exercise8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wecash on 19/4/15.
 */
public class ImportOfEmployee {

    static int sum = 0;

    //[[1,5,[2,3]],[2,3,[]],[3,3,[]]] 1

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        Employee employee = map.get(id);
        sumOf(employee, map);
        return sum;
    }

    private void sumOf(Employee employee, Map<Integer, Employee> map) {
        if (employee == null) return;
        sum += employee.importance;
        List<Integer> subordinates = employee.subordinates;
        if (subordinates.size() == 0) {
            return;
        }
        for (Integer subId : subordinates) {
            Employee sub = map.get(subId);
            sumOf(sub, map);
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee();
        e1.id = 1;
        e1.importance = 5;
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(3);
        e1.setSubordinates(l1);
        Employee e2 = new Employee();
        e2.id = 2;
        e2.importance = 3;
        e2.setSubordinates(new ArrayList<>());
        Employee e3 = new Employee();
        e3.id = 3;
        e3.importance = 3;
        e3.setSubordinates(new ArrayList<>());
        list.add(e1);
        list.add(e2);
        list.add(e3);
        ImportOfEmployee m = new ImportOfEmployee();
        m.getImportance(list, 1);
        System.out.print(sum);
    }
}

class Employee {

    public int id;

    public int importance;

    public List<Integer> subordinates;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public List<Integer> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Integer> subordinates) {
        this.subordinates = subordinates;
    }
}
