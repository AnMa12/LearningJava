package com.company.ExercitiuThreaduri;

import java.util.Scanner;

import static com.company.ExercitiuThreaduri.Occurrences.nrOcc;

public class MainExercitiuThreaduri {

    public static void main (String[] args) {

        //citim de la tastatura un cuvant
        Scanner iterator = new Scanner(System.in);
        System.out.print("Type the word: ");
        String word = iterator.next();

        //facem thread-urile
        Thread t1 = new Thread(new Occurrences("E:\\GitHub\\LearningJava\\Examen prep\\src\\com" +
                                                "\\company\\ExercitiuThreaduri\\text1", word));
        Thread t2 = new Thread(new Occurrences("E:\\GitHub\\LearningJava\\Examen prep\\src\\com" +
                                                "\\company\\ExercitiuThreaduri\\text2", word));
        Thread t3 = new Thread(new Occurrences("E:\\GitHub\\LearningJava\\Examen prep\\src\\com" +
                                                "\\company\\ExercitiuThreaduri\\text3", word));
        //dam drumu la thread-uri
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Numar total de aparitii: " + nrOcc);

    }
}
