package com.colllection.queue;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.offer("A");
      //  priorityQueue.offer(800); homogines
        priorityQueue.offer("B");
        priorityQueue.offer("C");
        priorityQueue.offer("D");
        priorityQueue.offer("E");
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);




    }
}
