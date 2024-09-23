package org.example;

import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offerFirst(20);
        q.offerLast(30);

        System.out.println(q);

        System.out.println(q.peekFirst());

        System.out.println(q.pollLast());
    }
}
