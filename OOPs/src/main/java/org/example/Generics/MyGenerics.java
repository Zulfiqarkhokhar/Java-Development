package org.example.Generics;

public class MyGenerics {
    public static void main(String[] args) {
        Person<Integer> obj = new Person<>(12);
        System.out.println(obj.getId());

    }
}

class Person<T>{
    T id;
    public Person(T id) {
        this.id = id;
    }

    public T getId() {
        return this.id;
    }
}
