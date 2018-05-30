package com.company.ExercitiuThreaduri;

import java.io.File;
import java.util.Scanner;

public class Occurrences implements Runnable {

    static int nrOcc;
    String textPath;
    String word;

    public Occurrences(String textPath, String word) {
        this.textPath = textPath;
        this.word = word;
    }

    public void run() {
        try {
            //cautam in fisier de cate ori apare cuvantul word
            Scanner iterator = new Scanner(new File(textPath));
            String line;

            while ((line = iterator.nextLine()) != null) {
                for (String element : line.split(" ")) {
                    if (element.equalsIgnoreCase(word)) {
                        nrOcc = nrOcc + 1;
                        System.out.println(nrOcc);
                        System.out.println("yes" + this.textPath);
                    }
                }
            }

        } catch (Exception e) {}

    }

}
