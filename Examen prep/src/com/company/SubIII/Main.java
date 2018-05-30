package com.company.SubIII;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class NrAparitii {

    public static int aparitii (String cuvant, String fName) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        Scanner scf = null;

        try {
            scf = new Scanner(new File(fName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] cuvinte;
        cuvinte = scf.nextLine().split(" ");
        HashMap hm = new HashMap();
        for (int i = 0; i < cuvinte.length; i++)
            if(cuvant.equals(cuvinte[i]))
                count++;
        System.out.println(count);
        scf.close();
        sc.close();
        return count;
    }
}

class CitireT extends Thread{
    public int count = 0;
    String fname;
    String cuvant;

    public CitireT(String cuvant, String fname){
        this.fname = fname;
        this.cuvant = cuvant;
    }

    @Override
    public void run() {
        count = NrAparitii.aparitii(cuvant, fname);
    }
}

class Main {

    public static int aparitii = 0;

    public static void main(String argv[]) {

        Scanner sc = new Scanner (System.in);
        String cuvant = sc.next();

        String fName1 = "E:\\GitHub\\LearningJava\\Examen prep\\src\\com\\company\\SubIII\\exemplu1.txt";
        String fName2 = "E:\\GitHub\\LearningJava\\Examen prep\\src\\com\\company\\SubIII\\exemplu2.txt";
        String fName3 = "E:\\GitHub\\LearningJava\\Examen prep\\src\\com\\company\\SubIII\\exemplu3";

        // rulate threaduri
        CitireT f1 = new CitireT(cuvant, fName1);
        CitireT f2 = new CitireT(cuvant, fName2);
        CitireT f3 = new CitireT(cuvant, fName3);

        f1.start();
        f2.start();
        f3.start();

        try {
            f1.join();
            f2.join();
            f3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Main.aparitii = f1.count + f2.count + f3.count;

        // Afisare rezultalte
        System.out.println("Nr aparitii: " + Main.aparitii);
    }
}


