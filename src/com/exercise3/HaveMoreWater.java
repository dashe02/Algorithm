package com.exercise3;

/**
 * Created by wecash on 19/3/25.
 */
public class HaveMoreWater {

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        HaveMoreWater h = new HaveMoreWater();
        int sum = h.haveMoreWater(heights);
        System.out.print(sum);
    }

    private int haveMoreWater(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int result = 0;
        while (i < j) {
            int area = (j - i) * Math.min(heights[i], heights[j]);
            result = Math.max(result, area);
            if (heights[j] >= heights[i]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
