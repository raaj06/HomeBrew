package com;


import java.util.Hashtable;

public class HashTableConcept {

    public static void main(String[] args) {

        Hashtable h = new Hashtable();

        h.put("a", 100);
        h.put("b", 200);
        h.put("c", 300);
        h.put("d", 1000);

        System.out.println(h.size());
        System.out.println(h.clone());
        System.out.println(h.get("a"));




    }
}
