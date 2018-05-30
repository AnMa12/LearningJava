package com.company.SubIII_Threads;

import java.io.File;
import java.util.Scanner;

public class Occurrences implements Runnable {

    int nrOcc;
    String textPath;
    String word;

    public Occurrences(String textPath, String word) {
        this.textPath = textPath;
        this.word = word;
    }

    public int getNrOcc() {
        return nrOcc;
    }

    public void run() {
        try {
            //cautam in fisier de cate ori apare cuvantul word
            Scanner iterator = new Scanner(new File(textPath));
            String line;

            //vedem de cate ori apare
            while ((line = iterator.nextLine()) != null) {
                for (String element : line.split(" ")) {
                    if (element.equalsIgnoreCase(word)) {
                        nrOcc = nrOcc + 1;
                    }
                }
            }

        } catch (Exception e) {}

    }

}
