package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long aOccurancesS = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == 'a')
                aOccurancesS++;
        if(n % s.length() == 0) {
            return aOccurancesS * n/s.length();
        }
        else {
            int subSlength = (int)(n % s.length());
            String subS = s.substring(0,subSlength);
            long aOccurancesSub = 0;
            for(int i = 0; i < subS.length(); i++)
                if(subS.charAt(i) == 'a')
                    aOccurancesSub++;
            System.out.println("*" + aOccurancesS + " " + n/s.length() + " " + aOccurancesSub + "**");
            return aOccurancesS * (n/s.length()) + aOccurancesSub;
        }
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aaaaaa",14));


    }
}
