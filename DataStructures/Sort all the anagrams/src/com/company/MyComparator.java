package com.company;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        if(o1 > o2)
            return 0; //trebuie interschimbate
        else
            return -1; //nu trebuie interschimbate
    }
}
