package com.algorithms.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//int arrSize = scanner.nextInt();
		System.out.println(fibList(240));
	}
	
	static double fibList(int num) {
		if(num == 0) return 0;
		if(num == 1) return 1;

		final long[] fibArray = new long [++num];
		fibArray[0] = 0;
		fibArray[1] = 1;
		for(int i=2;i<num;i++) {
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}
		return fibArray[--num];
	}

	static int FibRecursion(int n) {
		if(n<=1)
			return n;
		else  
			return FibRecursion(n-1) + FibRecursion(n-2);
	}

}
