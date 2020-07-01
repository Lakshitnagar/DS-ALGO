package ds.stack.p1;

import java.io.*;
import ds.stack.Stack;

public class S1 {

    public static void main(String args[]) {

        // Creation of empty Stack
        Stack stack = new Stack();

        // Populating data
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        // Printing data
        System.out.println("--- START ---");
        stack.printStack();
        System.out.println("--- END ---");

        stack.pop();

        // Printing data
        System.out.println("--- START ---");
        stack.printStack();
        System.out.println("--- END ---");
    }
}
