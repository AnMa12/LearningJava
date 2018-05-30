package com.company.ExempluLaborator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Resurse {
    public static void main(String[] args) {
        String numeFisier = "";
        try (FileReader f = new FileReader(numeFisier)) {
            int c;
            while ((c = f.read()) != -1)
                System.out.print((char) c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // FileReader implementeaza automat interfata AutoCloseable
        // iar acest lucru va face ca fisierul sa fie inchis in mod
        // automat dupa executia blocului try
    }
}