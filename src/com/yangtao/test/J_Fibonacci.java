package com.yangtao.test;

public class J_Fibonacci
{
    public static int mb_fibonacci(long i) {
        if (i < 1)
            return (0);
        else if (i == 1 || i == 2)
            return (1);
        return (mb_fibonacci(i - 1) + mb_fibonacci(i - 2));
    }

    public static void main(String[] args) {
        long i = 30;
        System.out.print("mb_fibonacci(" + i + ")="+mb_fibonacci(i));
    }
}