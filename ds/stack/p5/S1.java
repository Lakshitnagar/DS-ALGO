package ds.stack.p5;

import java.io.*;

import ds.stack.Stack;

import java.util.*;

public class S1 {

    public static void main(String args[]) {
        // Input
        int inputArr[] = {10, 4, 5, 90, 1, 80};
        int processedArr[] = new int[inputArr.length + 2];

        // Adding extremes as lowest of all {-1, 10, 4, 5, 90, 1, 80, -1}
        processedArr[0] = -1;
        for (int i = 1; i < processedArr.length-1; i++){
            processedArr[i] = inputArr[i-1];
        }
        processedArr[processedArr.length-1] = -1;

        // Output will contain position of left and right first low values
        int outputArr[][] = new int[inputArr.length][2];

        Stack stack = new Stack();

        for (int i = 0; i < processedArr.length; i++) {
            int X;

            while (!stack.isEmpty() && (processedArr[i] < processedArr[stack.top.data])) {
                X = stack.pop().data;

                int edgePositions[] = new int[2];
                edgePositions[0] = stack.top.data-1; // Left value
                edgePositions[1] = i-1; // Right value

                outputArr[X-1] = edgePositions;
            }

            stack.push(i);
        }

        // Printing data
        for (int i = 0; i < outputArr.length; i++) {
            System.out.println(Arrays.toString(outputArr[i]));
        }
    }
}
