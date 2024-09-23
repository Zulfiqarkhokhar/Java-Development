package org.example;

import java.util.Arrays;

public class LearnArrayClass {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};

        int index = Arrays.binarySearch(a,6);

        System.out.println(index);

        int nums[] = {2,4,1,9,5,8,3,6,7,};

        Arrays.sort(nums);

        for(int i:nums) {
            System.out.println(i);
        }
    }


}
