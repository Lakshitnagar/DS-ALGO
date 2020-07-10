package ds.stack.p7;

import java.io.*;

import ds.stack.Stack;

import java.util.*;

public class S1 {

    public static void main(String args[]) {
        // Input
        String inputStr = "mississippi";

        // Output will contain modified string
        char outputStr[] = new char[inputStr.length()];
        int stackPtr = -1;

        int i = 0;
        while (i < inputStr.length()) {
            if (stackPtr == -1 || inputStr.charAt(i) != outputStr[stackPtr]) {
                stackPtr++;
                outputStr[stackPtr] = inputStr.charAt(i);
                i++;
            } else {
                while (i < inputStr.length() && inputStr.charAt(i) == outputStr[stackPtr]) {
                    i++;
                }
                outputStr[stackPtr] = '\0';
                stackPtr--;
            }
        }

        // Printing data
        System.out.println(outputStr);
        System.out.println(outputStr.length);
    }
}
