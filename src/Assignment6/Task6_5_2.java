package Assignment6;

/**
 * Copyright Emy (2019)
 * All rights reserved.
 */

import java.util.Arrays;

public class Task6_5_2 {
    public static void main(String[] args) {
        int[][] results = new int[3][10];
        boolean done = false;
        int i = 1;
        while (true) {
            results[0][i-1] = h(i);
            results[1][i-1] = g(i);
            results[2][i-1] = fibo(i);
            if (++i>10) break;
        }

        System.out.println(Arrays.deepToString(results));
    }

    private static int h(int n) {
        if (n == 0) return 0;
        return 2*h(n-1)+2;
    }

    private static int g(int n) {
        if (n == -1 || n == 0) return 1;
        if(n % 2 == 0) return g(n-1)-g(n-2);
        return g(n-1)+g(n-2);
    }

    private static int fibo(int i) {
        if (i == 2 || i == 1) {
            return 1;
        }
        else {
            return fibo(i-1) + fibo(i-2);
        }
    }
}
