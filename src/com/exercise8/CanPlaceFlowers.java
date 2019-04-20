package com.exercise8;

/**
 * Created by wecash on 19/4/16.
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null) return false;
        if (flowerbed.length == 0) return false;
        if (flowerbed.length == 1) {
            if ((flowerbed[0] == 0 && n == 1) || (flowerbed[0] == 0 && n == 0)) return true;
            if (flowerbed[0] == 1 && n == 0) return true;
        }
        int i = 0;
        int j = 0;
        while (i < flowerbed.length - 1) {
            if (flowerbed[i] == 1 && flowerbed[i + 1] == 1) {
                return false;
            } else {
                if (flowerbed[i] == 1 && flowerbed[i + 1] == 0) {
                    j = i + 2;
                } else if (flowerbed[i] == 0 && flowerbed[i + 1] == 1) {
                    j = i + 3;
                } else if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    j = i;
                }
                if (j < flowerbed.length && flowerbed[j] == 0
                        && n > 0) {
                    if (j == 0) {
                        flowerbed[j] = 1;
                        n--;
                    } else {
                        if (flowerbed[j - 1] == 0) {
                            flowerbed[j] = 1;
                            n--;
                        }
                    }
                    i = j + 1;
                } else if (j < flowerbed.length && flowerbed[j] == 1) {
                    i = j + 2;
                } else {
                    i++;
                }
                if (n == 0) {
                    return true;
                }

            }
        }
        return false;
    }

    //0  1  2  3  4  5  6
    //1, 0, 1, 0, 0, 0, 1
    //0, 1, 0, 0, 0, 0, 1
    public static void main(String[] args) {
        int[] flowered = {1, 0, 0, 0, 0};
        int n = 2;
        CanPlaceFlowers c = new CanPlaceFlowers();
        System.out.print(c.canPlaceFlowers(flowered, n));
    }
}
