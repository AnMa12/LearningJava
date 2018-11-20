package com.company;

import java.util.Comparator;

public class DupaUsiComparator implements Comparator<Masini> {
    public int compare(Masini m1, Masini m2) {
        if(m1.getNrUsi() > m2.getNrUsi())
            return 0;
        return -1;
    }
}
