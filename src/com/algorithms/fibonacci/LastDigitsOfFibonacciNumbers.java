package com.algorithms.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class LastDigitsOfFibonacciNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        System.out.println(fibListLastNumber(arrSize));
    }

    static long fibListLastNumber(int num) {
        if(num <= 1) return num;

        long first, second, current = 0;
        first = 0;
        second = 1;
        for(int i=2;i<num;i++) {
            current = (first+second)%10;
            first = second;
            second = current;
        }

        return current;
    }
}
