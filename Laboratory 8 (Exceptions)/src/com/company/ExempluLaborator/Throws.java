package com.company.ExempluLaborator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public static void citesteFisier(String fis) throws FileNotFoundException, IOException {
        FileReader f = new FileReader(fis);
        int c;
        while ( (c=f.read()) != -1)
            System.out.print((char)c);
        f.close();
    }
    public static void main(String args[]) {
        try {
            citesteFisier("");
        } catch (FileNotFoundException e) {
            System.err.println("Fisierul nu a fost gasit");
        } catch (IOException e) {
            System.out.println("Eroare la citire");
        } catch (Exception e){
            System.out.println("Eroare");
        }
    }
}
