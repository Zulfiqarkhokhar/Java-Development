package org.example;

import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {

        Stack<String> fruits = new Stack<>();
        fruits.push("Apple");
        fruits.push("Orange");

        System.out.println(fruits.peek());

        fruits.pop();
        System.out.println(fruits);

        System.out.println(fruits.size());
    }
}
