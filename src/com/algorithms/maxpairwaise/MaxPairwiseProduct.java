package com.algorithms.maxpairwaise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {
	static long getMaxProdutosEmparelhados(int[] numeros) {
        long result = 0;
        int n = numeros.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((long)numeros[i] * numeros[j] > result) {
                    result = (long)numeros[i] * numeros[j];
                }
            }
        }
        return result;
    }

    // faster method
    static long getMaxProdutosEmparelhadosFast(int[] numeros) {
        int nSize = numeros.length;

        int index_max1 = -1;
        for (int i = 0; i < nSize; i++) {
            if ((index_max1 == -1) || (numeros[i] > numeros[index_max1]))
            	index_max1 = i;
        }

        int index_max2 = -1;
        for (int j = 0; j < nSize; j++) {
            if ((j != index_max1) && ((index_max2 == -1) || (numeros[j] > numeros[index_max2])))
            	index_max2 = j;
        }

        return (long)numeros[index_max1] * numeros[index_max2];
    }

    // main method
    public static void main(String[] args) {
        
        FastScanner scan = new FastScanner(System.in);
        int n = scan.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
        	numeros[i] = scan.nextInt();
        }
        
        System.out.println(getMaxProdutosEmparelhadosFast(numeros));
        

    /*
    // stress test
    while (true) {
        Random ran = new Random();
        int max = 5;
        int min = 2;
        int randomNum = ran.nextInt((max - min) + 1) + min;
        System.out.println("Random number: " + randomNum);
        int[] list = new int[randomNum];
        for (int i = 0; i < randomNum; i++) {
            list[i] = ran.nextInt((10) + 1);
            System.out.println(list[i]);
        }
        System.out.println("");
        double result1 = getMaxPairwiseProduct(list);
        double result2 = getMaxPairwiseProductFast(list);
        if (result1 != result2) {
            System.out.println("Error! slow:  " + result1 + " fast: " + result2);
            break;
        } else {
            System.out.println("OK");
        }
    }
     */
}
    // scanning code
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
