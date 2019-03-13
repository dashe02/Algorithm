package com.exercise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/13.
 */
public class FindRepeated {

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        FindRepeated f = new FindRepeated();
        List<Integer> list = f.findRepeated(array);
        System.out.print(list);
    }

    private List<Integer> findRepeated(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

        }
        return result;
    }
}
