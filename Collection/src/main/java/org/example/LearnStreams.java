package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStreams {

    public static void main(String[] args) {


        // creating a stream
        //method 1

        String arr[] = {"Apple","Mango","Banana"};

        Stream<String> stm = Arrays.stream(arr);

        // method 2

        List<Integer> nums = Arrays.asList(10,20,30,40,50);
        Stream<Integer> nums2 = nums.stream();

        // method 3

        Stream<Integer> intSmt = Stream.of(1,2,3,4,5,6);

        // method 4

        Stream<Integer> numbers = Stream.iterate(1,n->n+1).limit(100);

        // method 5

        Stream<String> strSmt2 = Stream.generate(()->"Hello").limit(5);


        // filter

        List<Integer> even = intSmt.filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);

        // Map

        List<Integer> divisible = even.stream().map(n->n/2).collect(Collectors.toList());
        System.out.println(divisible);




    }
}
