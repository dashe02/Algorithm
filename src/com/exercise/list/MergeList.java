package com.exercise.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/13.
 */
public class MergeList {


    public static void main(String[] args) {

        List<Partition> partitionList = new ArrayList<>();
        Partition p1 = new Partition(1, 4);
        Partition p2 = new Partition(4, 5);
        //Partition p3 = new Partition(8, 10);
        //Partition p4 = new Partition(15, 18);
        partitionList.add(p1);
        partitionList.add(p2);
        //partitionList.add(p3);
        //partitionList.add(p4);
        MergeList m = new MergeList();
        List<Partition> resultList = m.mergeList(partitionList);
        System.out.print(resultList);
    }

    private List<Partition> mergeList(List<Partition> partitionList) {
        List<Partition> result = new ArrayList<>();
        for (int i = 0; i < partitionList.size() - 1; i += 2) {
            if (i == partitionList.size() - 1) {
                mergeTwo(partitionList.get(partitionList.size() - 3),
                        partitionList.get(partitionList.size() - 2), result);
            } else {
                mergeTwo(partitionList.get(i), partitionList.get(i + 1), result);
            }
        }
        return result;
    }


    private void mergeTwo(Partition p1, Partition p2, List<Partition> result) {
        if (p1.left <= p1.right && p2.left <= p2.right) {
            if (p1.right >= p2.left) {
                //合并,否则不能合并
                Partition mergePartition = new Partition(p1.left, p2.right);
                result.add(mergePartition);
            } else {
                result.add(p1);
                result.add(p2);
            }
        }
    }
}

class Partition {

    int left;

    int right;

    public Partition(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Partition{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
