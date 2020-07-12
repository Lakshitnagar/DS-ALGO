package ds.queue.p4;

import java.io.*;
import ds.queue.Queue;

public class S1 {

    public static void main(String args[]) {

        // Creation of empty Stack
        stackUsingQueues stack = new stackUsingQueues();

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

    public static class stackUsingQueues {
        Queue q1 = new Queue();
        Queue q2 = new Queue();

        public void push(int data){
            if(q1.isEmpty()) q2.enqueue(data);
            else q1.enqueue(data);
        }

        public int pop(){
            int i, size;

            if(q1.isEmpty()){
                i = 1;
                size = q2.size;

                while (i < size){
                    q1.enqueue(q2.dequeue().data);
                    i++;
                }

                return q2.dequeue().data;
            } else {
                i = 1;
                size = q1.size;

                while (i < size){
                    q2.enqueue(q1.dequeue().data);
                    i++;
                }

                return q1.dequeue().data;
            }
        }

        public void printStack(){
            if(q1.isEmpty()){
                reverseQueue(q2);
                q2.printQueue();
                reverseQueue(q2);
            } else {
                reverseQueue(q1);
                q1.printQueue();
                reverseQueue(q1);
            }
        }

        public void reverseQueue(Queue queue){
            if(queue.isEmpty()) return;

            int data = queue.dequeue().data;
            reverseQueue(queue);
            queue.enqueue(data);
        }
    }
}
