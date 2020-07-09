package ds.stack.p6;

import java.io.*;

import ds.stack.Stack;

import java.util.*;

public class S1 {

    public static void main(String args[]) {
        // Input
        int inputArr[] = {6, 2, 5, 4, 5, 1, 6};
        int processedArr[] = new int[inputArr.length + 2];

        // Adding extremes as lowest of all {-1, 10, 4, 5, 90, 1, 80, -1}
        processedArr[0] = -1;
        for (int i = 1; i < processedArr.length - 1; i++) {
            processedArr[i] = inputArr[i - 1];
        }
        processedArr[processedArr.length - 1] = -1;

        // Output will contain maxArea of rectangle
        int maxArea = 0;

        Stack stack = new Stack();

        for (int i = 0; i < processedArr.length; i++) {
            int X;

            while (!stack.isEmpty() && (processedArr[i] < processedArr[stack.top.data])) {
                X = stack.pop().data;

                int leftIndex = stack.top.data - 1; // Left value
                int righttIndex = i - 1; // Right value
                int height = inputArr[X - 1];

                int area = height * (righttIndex - 1 - (leftIndex));

                maxArea = area > maxArea ? area : maxArea;
            }

            stack.push(i);
        }

        // Printing data
        System.out.println(maxArea);
    }
}
