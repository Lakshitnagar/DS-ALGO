package ds.stack.p4;

import java.io.*;

import ds.stack.Stack;

import java.util.*;

public class S1 {

    public static void main(String args[]) {
        // Input
        int A[] = {10, 4, 5, 90, 120, 80};

        // Output
        int S[] = new int[A.length];
        S[0] = 1;

        getSpans(A, S);

        // Printing data
        System.out.println(Arrays.toString(S));
    }

    static void getSpans(int[] inputArr, int[] outputArr) {
        // Creation of empty Stack
        Stack stack = new Stack();
        // Initialize
        stack.push(0);

        for (int i = 1; i < inputArr.length; i++) {
            while (!stack.isEmpty() && inputArr[stack.top.data] <= inputArr[i])
                stack.pop();

            outputArr[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.top.data);

            stack.push(i);
        }
    }
}
