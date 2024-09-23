package org.example.Encapsulation;

public class UseTeacher {
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        t1.setId(12);
        t1.setName("Yasir Ali");
        t1.setSalary(200000.45);
        String teacher1 = t1.toString();
        System.out.println(teacher1);

        Teacher t2 = new Teacher();
        t2.setId(15);
        t2.setName("Ameer Ali");
        t2.setSalary(400000.45);
        String teacher2 = t2.toString();
        System.out.println(teacher2);


    }
}
