package Assignment6;

/**
 * Copyright Emy (2019)
 * All rights reserved.
 */

public class Task6_5_1 {
    public static void main(String[] args) {
        // Show Iteration steps
        boolean iterationSteps = false;

        // 6.2.1 a
        double resultA = 0;
        for (int i = 0; i <= 4; i++) {
            double currentIteration = Math.pow(2,i*-1);
            resultA += currentIteration;
            if (iterationSteps) System.out.println(i+ ". Iteration: "+ currentIteration);
        }
        System.out.println("Result for 6.2.1 a) " + resultA + "\n");

        // 6.2.1 b
        double resultB = 0;
        for (int i = 1; i <= 4; i++) {
            double currentIteration = Math.pow(i,(double)1/i);
            resultB += currentIteration;
            if (iterationSteps) System.out.println(i+ ". Iteration: "+ currentIteration);
        }
        System.out.println("Result for 6.2.1 b) " + resultB + "\n");

        // 6.2.1 c
        double resultC = 0;
        for (int i = 0; i <= 4; i++) {
            double currentIteration = Math.pow(-1,i-1) * Math.pow(i,2);
            resultC += currentIteration;
            if (iterationSteps) System.out.println(i+ ". Iteration: "+ currentIteration);
        }
        System.out.println("Result for 6.2.1 c) " + resultC + "\n");

        // 6.2.1 d
        double resultD = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= i; j++) {
                double currentIteration = Math.pow(i+j,i);
                resultD += currentIteration;
                if (iterationSteps) System.out.println(i+ ". Outer Iteration " + j + ". Inner Iteration: "+ currentIteration);
            }
        }
        System.out.println("Result for 6.2.1 d) " + resultD + "\n");

        // 6.2.1 e
        double resultE = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= i; j++) {
                double currentIteration = Math.pow((i+j),j);
                resultE += currentIteration;
                if (iterationSteps) System.out.println(i+ ". Outer Iteration " + j + ". Inner Iteration: "+ currentIteration);
            }
        }
        System.out.println("Result for 6.2.1 e) " + resultE + "\n");

        // 6.2.1 f
        double resultF = 0;
        for (int i = 0; i <= 5; i++) {
            double currentIteration = Math.pow(2,i);
            if (i == 0) {
                resultF = currentIteration;
            } else {
                resultF *= currentIteration;
            }
            if (iterationSteps) System.out.println(i+ ". Iteration " + currentIteration);
        }
        System.out.println("Result for 6.2.1 f) " + resultF + "\n");

        // 6.2.1 g
        double resultG = 0;
        for (int i = 5; i <= 9; i++) {
            double currentIteration = (i+1);
            if (i == 5) {
                resultG = currentIteration;
            } else {
                resultG *= currentIteration;
            }
            if (iterationSteps) System.out.println(i+ ". Iteration " + currentIteration);
        }
        System.out.println("Result for 6.2.1 g) " + resultG + "\n");

        // 6.2.1 h
        double resultH = 0;
        for (int i = 1; i <= 5; i++) {
            double currentIteration = Math.pow(i, Math.pow(-1, i));
            if (i == 1) {
                resultH = currentIteration;
            } else {
                resultH *= currentIteration;
            }
            if (iterationSteps) System.out.println(i+ ". Iteration " + currentIteration);
        }
        System.out.println("Result for 6.2.1h) " + resultH + "\n");
    }
}
