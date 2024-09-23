package org.example.ObjectAndClass;

public class UseStudent {
    public static void main(String[] args){
        Student student = new Student();
        student.roll = 100;
        student.name = "Zulfiqar";
        student.percentage = 81.23;

        System.out.println("Roll = "+student.roll);
        System.out.println("Name = "+student.name);
        System.out.println("Percentage = "+student.percentage);
    }

}
