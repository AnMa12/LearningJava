package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

public class Main {

    public static String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static void sort(String[] array) {
        Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();

        /* group words by anagram */
        for(String s: array) {
            String key = sortChars(s);
            if(!hash.containsKey(key))
                hash.put(key, new LinkedList<String>());
            LinkedList<String> anagrams = hash.get(key);
            anagrams.push(s);
        }

        System.out.println();
        System.out.println(hash);

        /* Convert hash table to array */
        int index = 0;
        for(String key : hash.keySet()) {
            LinkedList<String> list = hash.get(key);
            for(String t: list) {
                array[index] = t;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        String[] anagrame = new String[]{"ana", "bob", "naa", "aan", "bbo"};

        for(int i = 0; i < anagrame.length; i++)
            System.out.print(anagrame[i] + " ");

        sort(anagrame);

        for(int i = 0; i < anagrame.length; i++)
            System.out.print(anagrame[i] + " ");

    }
}
