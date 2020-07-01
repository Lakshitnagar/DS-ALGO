package ds.stack.p2;

import java.io.*;
import ds.stack.Stack;

public class S1 {

    public static void main(String args[]) {

        // Creation of empty Stack
        Stack stack = new Stack();

        // Input
        String expression = "{1 + [3 * (4-9)]}";

        char[] tokens = expression.toCharArray();
        Stack.StackNode tempNode;
        boolean result = true;

        for(char token: tokens){
            switch (token){
                case '{':
                case '[':
                case '(':
                    stack.push((int) token);
                    break;
                case '}':
                    if(stack.isEmpty()) result = false;
                    tempNode = stack.pop();
                    if(tempNode.data != (int)'{') result = false;
                    break;
                case ']':
                    if(stack.isEmpty()) result = false;
                    tempNode = stack.pop();
                    if(tempNode.data != (int)'[') result = false;
                    break;
                case ')':
                    if(stack.isEmpty()) result = false;
                    tempNode = stack.pop();
                    if(tempNode.data != (int)'(') result = false;
                    break;
            }

            if(!result) break;
        }

        if(!stack.isEmpty()) result = false;

        System.out.println(result);
    }
}
