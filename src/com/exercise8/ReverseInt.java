package com.exercise8;

/**
 * Created by wecash on 19/4/20.
 */
public class ReverseInt {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int temp = ans * 10 + x % 10;
            if (temp / 10 != ans)
                return 0;
            ans = temp;
            x /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = -2147483648;
        ReverseInt r = new ReverseInt();
        int sum = r.reverse(x);
        System.out.print(sum);
    }
}
