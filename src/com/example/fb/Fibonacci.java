package com.example.fb;

/**
 * Created by wecash on 19/2/17.
 */
public class Fibonacci {

    public int fibonacci(int n) {
        if (n > 39) {
            return 0;
        }
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(5));
    }
}
