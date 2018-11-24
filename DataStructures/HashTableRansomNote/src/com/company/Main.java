package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static boolean check(String[] magazine, String[] ransom) {
        if (magazine.length < ransom.length) {
            return false;
        }

        Map<String, Integer> magazineMap = createMap(magazine);
        Map<String, Integer> ransomMap = createMap(ransom);

        for (Map.Entry<String, Integer> entry : ransomMap.entrySet()) {
            String key = entry.getKey();
            if (!magazineMap.containsKey(key)) {
                return false;
            } else if (magazineMap.get(key) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    static Map<String, Integer> createMap(String[] arr) {
        Map<String, Integer> map = new HashMap<>();

        for(String str : arr) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        boolean check = check(magazine, ransom);
        if (check) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}