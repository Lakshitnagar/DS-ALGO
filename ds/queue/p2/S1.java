package ds.queue.p2;

import java.io.*;
import ds.queue.Queue;

public class S1 {

    public static void main(String args[]) {

        // Creation of empty Stack
        Queue queue = new Queue();

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

        reverseQueue(queue);

        // Printing data
        System.out.println("--- START ---");
        queue.printQueue();
        System.out.println("--- END ---");
    }

    public static void reverseQueue(Queue queue){
        if(queue.isEmpty()) return;

        int data = queue.dequeue().data;
        reverseQueue(queue);
        queue.enqueue(data);
    }
}
