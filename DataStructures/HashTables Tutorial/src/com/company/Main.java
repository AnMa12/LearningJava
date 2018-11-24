package com.company;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        Hashtable<String, String> myHash = new Hashtable<String, String>();

        //1)put an object into Hashtable
        myHash.put("Romania", "Bucharest");
        myHash.put("France", "Paris");
        myHash.put("Spain", "Madrid");

        //2)retrieve an object from Hashtable
        //retrieve the value using the key
        System.out.println(myHash.get("Romania"));

        //4)check if hashtable contains a particular value
        System.out.println(myHash.containsValue("Paris"));
        System.out.println(myHash.containsValue("Berlin"));

        //5)check if hashtable contains a particular key
        System.out.println(myHash.containsKey("Sweden"));
        System.out.println(myHash.containsKey("Romania"));

        //7)check if hashtable is empty
        System.out.println(myHash.isEmpty());

        //9)the size of hashtable
        System.out.println(myHash.size());

        System.out.println("***");

        //10)get all the values
        Collection hashValues = myHash.values();
        Enumeration hashEnum = myHash.elements();

        System.out.println(myHash.values());
        System.out.println(myHash.elements());

        /*while(hashEnum.hasMoreElements())
            System.out.print(hashEnum.nextElement() + " ");
        System.out.println();*/

        //11)get all the keys
        Set hashKeys = myHash.keySet();
        Enumeration hashEnumKeys = myHash.keys();

        System.out.println(myHash.keySet());
        System.out.println(myHash.keys());

        System.out.println("***");

        myHash.clear();
        System.out.println(myHash.size());
    }
}