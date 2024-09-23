package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(10);
        pq.offer(5);
        pq.offer(15);

        System.out.println(pq);

        System.out.println(pq.poll());

    }
}
