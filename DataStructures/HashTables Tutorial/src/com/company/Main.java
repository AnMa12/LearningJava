package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        Hashtable<String, String> capitalsHash = new Hashtable<String, String>();

        capitalsHash.put("Romania", "Bucharest");
        capitalsHash.put("France", "Paris");
        capitalsHash.put("Italy", "Rome");

        System.out.println(capitalsHash.get("Romania"));

        System.out.println(capitalsHash.containsValue("Paris"));
        System.out.println(capitalsHash.containsKey("Italy"));

        Enumeration enumHashValues = capitalsHash.elements();
        while(enumHashValues.hasMoreElements()) {
            System.out.print(enumHashValues.nextElement());
        }
        System.out.println();

        Collection collectionHashValues = capitalsHash.values();
        Iterator<String> iterator = collectionHashValues.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        Enumeration enumHashKeys = capitalsHash.keys();
        while(enumHashKeys.hasMoreElements()) {
            System.out.print(enumHashKeys.nextElement());
        }
        System.out.println();

        Set setHashKeys = capitalsHash.keySet();
        Iterator<String> iteratorKeys = setHashKeys.iterator();
        while(iteratorKeys.hasNext())
            System.out.print(iteratorKeys.next() + " ");
        System.out.println();
    }
}