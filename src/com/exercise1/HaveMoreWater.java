package com.exercise1;

/**
 * Created by wecash on 19/3/24.
 */
public class HaveMoreWater {

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        HaveMoreWater h = new HaveMoreWater();
        int area = h.haveMoreWater(heights);
        System.out.print(area);
    }

    private int haveMoreWater(int[] heights) {
        int result = 0;
        int i = 0;
        int j = heights.length - 1;
        while (i < j) {
            int area = (j - i) * Math.min(heights[i], heights[j]);
            result = Math.max(area, result);
            if (heights[j] >= heights[i]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
