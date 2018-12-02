package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Hashtable<String, LinkedList<String>> H = new Hashtable<String, LinkedList<String>>();

        H.put("Romania", new LinkedList<String>());
        LinkedList<String> L = H.get("Romania");
        L.add("Bucharest");
        L.add("Galati");

        H.put("Spain", new LinkedList<String>());
        L = H.get("Spain");
        L.add("Sevillia");
        L.add("Madrid");

        Set keysSet = H.keySet();
        Iterator i = keysSet.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        Enumeration keysCollection = H.keys();
        Itera

    }
}
