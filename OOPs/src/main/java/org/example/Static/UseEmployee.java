package org.example.Static;

public class UseEmployee {
    public static void main(String[] args){
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.id = 10;
        employee2.id = 11;

        System.out.println(employee1.id);
        System.out.println(employee2.id);

        Employee.age = 24;
        System.out.println(Employee.age);

    }
}
