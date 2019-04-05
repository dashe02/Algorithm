package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wecash on 19/4/3.
 */
public class Test1 {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User u1 = new User(1, "username1", BigDecimal.valueOf(1));
        User u2 = new User(2, "username2", BigDecimal.valueOf(2));
        User u3 = new User(3, "username3", BigDecimal.valueOf(3));
        User u4 = new User(4, "username4", BigDecimal.valueOf(4));
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        //Map<Integer, String> map = list.stream().collect(Collectors.toMap(User::getId, User::getName));
        //System.out.print(map);
        //List<User> res = list.stream().filter(a -> a.getName().equals("username1")).collect(Collectors.toList());
        //System.out.print(res);
        BigDecimal sum = list.stream().map(User::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.print(sum);
    }
}

class User {
    int id;

    String name;

    BigDecimal money;

    public User(int id, String name, BigDecimal money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
