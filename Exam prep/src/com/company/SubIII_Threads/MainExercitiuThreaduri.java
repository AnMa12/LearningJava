package com.company.SubIII_Threads;

import java.util.Scanner;

public class MainExercitiuThreaduri {

    public static void main (String[] args) {

        //citim de la tastatura un cuvant
        Scanner iterator = new Scanner(System.in);
        System.out.print("Type the word: ");
        String word = iterator.next();

        //facem cele 3 obiecte
        Occurrences o1 = new Occurrences("E:\\GitHub\\LearningJava\\Examen prep\\src\\com" +
                                          "\\company\\SubIII_Threads\\text1", word);
        Occurrences o2 = new Occurrences("E:\\GitHub\\LearningJava\\Examen prep\\src\\com" +
                                          "\\company\\SubIII_Threads\\text2", word);

        Occurrences o3 = new Occurrences("E:\\GitHub\\LearningJava\\Examen prep\\src\\com" +
                                          "\\company\\SubIII_Threads\\text3", word);

        //facem thread-urile
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        Thread t3 = new Thread(o3);

        //dam drumu la thread-uri
        t1.start();
        t2.start();
        t3.start();

        //???ceva
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //facem suma finala
        int sumOcc = o1.getNrOcc() + o2.getNrOcc() + o3.getNrOcc();
        System.out.println("Numar total de aparitii: " + sumOcc);

    }
}
