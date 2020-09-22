package com.algorithms.leastcommonmultiple;

import java.util.Scanner;

public class LeastCommonMultiple {
    static long euclidsGCD(long n1,long n2) {
        if(n1==0) return n2;
        return euclidsGCD((n2%n1),n1);
    }

    static long lcm(long a, long b) {
        return (a*b)/euclidsGCD(a, b);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextInt();
        long num2 = scanner.nextInt();
        System.out.println(lcm(num1, num2));
    }
}
