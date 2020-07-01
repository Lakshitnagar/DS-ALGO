package ds.stack.p3;

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

        reverse(stack);

        // Printing data
        System.out.println("--- START ---");
        stack.printStack();
        System.out.println("--- END ---");
    }

    static void reverse(Stack stack){
        int data;

        if(stack.isEmpty()) return;

        data = stack.pop().data;
        reverse(stack);
        insertAtBottom(stack, data);
    }

    static void insertAtBottom(Stack s, int d){
        int t;
        if(s.isEmpty()){
            s.push(d);
        } else {
            t = s.pop().data;
            insertAtBottom(s, d);
            s.push(t);
        }
    }
}
