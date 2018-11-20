package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {

    public String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    @Override
    public String toString() {
        return "AnagramComparator{}";
    }

    @Override
    public int compare(String o1, String o2) {
        return sortChars(o1).compareTo(sortChars(o2));
    }
}
