package org.example.Wrapper;

public class WrapperClass {

    public static void main(String[] args) {
        Integer obj1 = new Integer(12);
        Integer obj2 = Integer.valueOf(12);
        Integer obj3 = 12;

        System.out.println(obj1 + " " + obj2 + " " + obj3);

        int a = obj3;
        System.out.println(a);
    }
}
