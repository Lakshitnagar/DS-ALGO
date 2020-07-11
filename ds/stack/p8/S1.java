package ds.stack.p8;

import java.io.*;

import ds.stack.Stack;

import java.util.*;

public class S1 {

    public static void main(String args[]) {
        // Input
        int inputArr[] = {6, 2, 5, 4, 5, 1, 6};

        // Output will contain positions of NGE
        int outputArr[] = new int[inputArr.length];

        Stack stack = new Stack();
        stack.push(0);
        int nextGreaterPosition;

        for(int i=1; i<inputArr.length; i++){
            nextGreaterPosition = i;

            while (!stack.isEmpty() && inputArr[nextGreaterPosition] > inputArr[stack.top.data]){
                outputArr[stack.top.data] = nextGreaterPosition;
                stack.pop();
            }

            stack.push(nextGreaterPosition);
        }

        // Residue in stack will contain elements position whose NGE dos not exists
        while (!stack.isEmpty()){
            outputArr[stack.pop().data] = -1;
        }

        // Printing data
        for (int i = 0; i < outputArr.length; i++) {
            int out = outputArr[i]==-1?-1:inputArr[outputArr[i]];
            System.out.println(inputArr[i] + " : " + out);
        }
    }
}
