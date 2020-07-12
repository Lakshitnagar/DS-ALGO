package ds.queue.p3;

import java.io.*;

import ds.stack.Stack;

public class S1 {

    public static void main(String args[]) {

        // Creation of a empty queueUsingStacks
        queueUsingStacks queue = new queueUsingStacks();

        // Populating data
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        // Printing data
        System.out.println("--- START ---");
        queue.printQueue();
        System.out.println("--- END ---");

        queue.dequeue();

        // Printing data
        System.out.println("--- START ---");
        queue.printQueue();
        System.out.println("--- END ---");
    }

    public static class queueUsingStacks {
        // Creation of two empty Stacks
        Stack s1 = new Stack();
        Stack s2 = new Stack();

        public void enqueue(int data) {
            s1.push(data);
        }

        public int dequeue() {
            if (!s2.isEmpty()) {
                return s2.pop().data;
            } else {
                if(!s1.isEmpty()){
                    while (!s1.isEmpty()){
                        s2.push(s1.pop().data);
                    }

                    return s2.top.data;
                } else {
                    return -1;
                }
            }
        }

        public void printQueue(){
            while (!s1.isEmpty()){
                s2.push(s1.pop().data);
            }

            s2.printStack();
        }
    }
}
