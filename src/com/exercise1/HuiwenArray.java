package com.exercise1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/3/19.
 */
public class HuiwenArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 1, 3, 2};
        //int[] array = {51, 23, 52, 97, 97, 76, 23, 51};
        HuiwenArray h = new HuiwenArray();
        int[] preArray = h.preHandle(array);
        int sum = h.huiwenArray(preArray);
        System.out.print(sum);
    }

    private int huiwenArray(int[] preArray) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0, j = preArray.length - 1;
        while (i < j) {
            if (preArray[i] != preArray[j]) {
                map.put(i, j);
            }
            i++;
            j--;
        }
        //1, 2, 1, 3, 2 1
        int[] result = new int[preArray.length + (map.size() * 2)];
        i = 0;
        j = preArray.length - 1;
        int m = 0;
        int n = result.length - 1;
        while (i < j) {
            Integer t = map.get(i);
            result[m] = preArray[i];
            if (t != null) {
                if (t - i == 1) {
                    if (preArray[i] > preArray[t]) {
                        result[m + 1] = preArray[t];
                        swap(m, m + 1, result);
                        m++;
                    } else {
                        result[n] = preArray[i];
                        n--;
                    }
                } else {
                    result[m + 1] = preArray[t];
                    result[n] = preArray[i];
                    m++;
                    n--;
                }
            }
            result[n] = preArray[j];
            m++;
            n--;
            i++;
            j--;
        }
        System.out.print(Arrays.toString(result));
        return 0;
    }


    private void swap(int m, int i, int[] result) {
        int temp = result[m];
        result[m] = result[i];
        result[i] = temp;
    }

    private int[] preHandle(int[] array) {
        int[] result = new int[array.length + 1];
        if (array[0] != array[array.length - 1]) {
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i];
            }
            result[array.length] = array[0];
            return result;
        }
        return array;
    }

    //51 23 52 76 97 97 76 52 23 51
    //1,2,1,3,1,2,1

}

