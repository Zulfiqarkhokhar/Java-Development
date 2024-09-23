package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);

        list.add(2,1000);

        System.out.println(list);

        System.out.println(list.get(6));

        list.remove(Integer.valueOf(1000));
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains(50));

        for(Integer element: list){
            System.out.println(element);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
