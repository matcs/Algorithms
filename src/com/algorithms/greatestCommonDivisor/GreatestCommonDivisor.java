package com.algorithms.greatestCommonDivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
      System.out.println(EuclidsGCD(num1,num2));
    }

    static int NaiveGCD(int n1, int n2){
        int best = 0;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                best = i;
            }
        }
        return best;
    }
    static  int EuclidsGCD(int n1,int n2){
        if(n1==0) return n2;
        return EuclidsGCD((n2%n1),n1);
    }
}
