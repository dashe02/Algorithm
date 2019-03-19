package com.exercise1;

/**
 * Created by wecash on 19/3/18.
 */
public class MinSizeSubArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 2, 4, 3};
        int target = 1;
        MinSizeSubArray m = new MinSizeSubArray();
        int x = m.minSizeSubArray(array, target);
        System.out.print(x);
    }

    private int minSizeSubArray(int[] array, int target) {
        int length = 1;
        int temp = 1;
        for (int i = 0; i < array.length; i++) {
            int tempVal = 0;
            for (int j = i + 1; j < array.length; ) {
                tempVal = tempVal + array[j];
                if (array[i] + tempVal < target) {
                    temp++;
                    j++;
                } else {
                    if (array[i] + tempVal == target) {
                        temp++;
                        if (length == 1) {
                            length = temp;
                        } else {
                            if (temp > 1 && length > temp) {
                                length = temp;
                            }
                        }
                        j++;
                    } else {
                        temp = 1;
                        break;
                    }

                }
            }
        }
        return length;
    }


}
