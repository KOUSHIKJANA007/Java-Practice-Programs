package com.example.collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
//        System.out.println(queue.remove()); //return error when queue is empty
    }
}
