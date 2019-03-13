package com.exercise.array;

/**
 * Created by wecash on 19/3/13.
 */
public class DeleteRepeated {

    public static void main(String[] args) {
        int[] array = {1,1,2};
        DeleteRepeated d = new DeleteRepeated();
        int result = d.deleteRepeated(array);
        System.out.println(result);
    }

    private int deleteRepeated(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                if (array[array.length - 2] == array[array.length - 1]) {
                    k++;
                }
            }else {
                if (array[i] == array[i + 1]) {
                    k++;
                }
            }
        }
        return k;
    }
}
