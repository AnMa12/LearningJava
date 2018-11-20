package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        String[] anagrame = new String[]{"ana", "bob", "naa", "ann", "boo"};

        for(int i = 0; i < anagrame.length; i++)
            System.out.print(anagrame[i] + " ");
        Arrays.sort(anagrame,new AnagramComparator());

        System.out.println();

        for(int i = 0; i < anagrame.length; i++)
            System.out.print(anagrame[i] + " ");

        System.out.println();

        Integer[] valori = new Integer[]{1, 8, 5, 4, 2};
        for(int i = 0; i < valori.length; i++)
            System.out.print(valori[i] + " ");

        System.out.println();

        Arrays.sort(valori, new MyComparator());
        for(int i = 0; i < valori.length; i++)
            System.out.print(valori[i] + " ");

        System.out.println();
        Masini masina1 = new Masini(15,1);
        Masini masina2 = new Masini(10,2);
        Masini masina3 = new Masini(5,3);
        Masini[] masini = new Masini[]{masina1, masina2, masina3};

        for(int i = 0; i < masini.length; i++)
            System.out.print(masini[i].toString() + " ");
        Arrays.sort(masini, new DupaUsiComparator());
        System.out.println();
        for(int i = 0; i < masini.length; i++)
            System.out.print(masini[i].toString() + " ");
    }
}
