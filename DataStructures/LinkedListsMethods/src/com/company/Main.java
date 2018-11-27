package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        String[] words = {"1","22","333","4444"};
        List<String> myList = new ArrayList<String>();
        for(int i = 0; i < words.length; i++)
            myList.add(words[i]);

        System.out.println(myList);
        //22 and 333
        myList.subList(1,3).clear();
        System.out.println(myList);

        ListIterator<String> i = myList.listIterator(myList.size());
        while(i.hasPrevious()) {
            System.out.println(i.previous());
        }


    }
}
