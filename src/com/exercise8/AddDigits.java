package com.exercise8;

/**
 * Created by wecash on 19/4/16.
 */
public class AddDigits {

    //38  11
    public int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum / 10 == 0) {
            return sum;
        } else {
            return addDigits(sum);
        }
    }

    public static void main(String[] args) {
        int num = 38;
        AddDigits a = new AddDigits();
        int sum = a.addDigits(num);
        System.out.print(sum);
    }
}
