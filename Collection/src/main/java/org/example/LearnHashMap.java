package org.example;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

    public static void main(String[] args) {


        Map<String,Integer> st = new HashMap<>();

        st.put("Amir",10);
        st.put("Zullfiqar",20);

        System.out.println(st);

        for(Map.Entry<String,Integer> e: st.entrySet()) {
            System.out.println(e.getValue());
        }
    }
}
