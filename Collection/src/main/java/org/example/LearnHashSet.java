package org.example;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);


        System.out.println(set);


        System.out.println(set.contains(30));

        set.remove(30);
        System.out.println(set);

        //set.clear();
        //set.isEmpty();
    }
}
