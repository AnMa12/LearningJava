package com.company.ExempluLaborator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CitireFisier {
    public static void main (String[] args){
        String fis = "E:\\GitHub\\LearningJava\\Exceptii\\src\\com\\company\\ExempluLaborator\\fisier.txt"; // calea catre fisierul de citit
        FileReader f = null;

        // Deschidem fisierul
        try {
            f = new FileReader(fis);
        } catch (FileNotFoundException e) {
            System.out.println("fisierul nu exista");
        }

        // Citim si afisam fisierul caracter cu caracter
        int c;
        try {
            while ((c = f.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Inchidem fisierul
        try {
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Fisierul nu poate fi inchis");
        }
    }
}