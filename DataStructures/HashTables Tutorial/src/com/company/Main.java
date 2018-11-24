package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        /*Hashtable<String, String> capitalsHash = new Hashtable<String, String>();

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
        System.out.println();*/

        Hashtable<String,LinkedList<String>> h = new  Hashtable<String, LinkedList<String>>();

        h.put("Romania", new LinkedList<String>());
        LinkedList<String> cities = h.get("Romania");
        cities.push("Galati");
        cities.push("Braila");

        h.put("France", new LinkedList<String>());
        LinkedList<String> cities2 = h.get("France");
        cities2.push("Nice");

        h.put("Spain", new LinkedList<String>());
        LinkedList<String> cities3 = h.get("Spain");
        cities3.push("Madrid");
        cities3.push("Barcelona");
        cities3.push("Sevilla");


        //get the hashtable values
        Enumeration enumHValues = h.elements();
        while(enumHValues.hasMoreElements()) {
            LinkedList<String> list = (LinkedList<String>)enumHValues.nextElement();
            for(String l : list)
            System.out.println(l);
        }
    }
}