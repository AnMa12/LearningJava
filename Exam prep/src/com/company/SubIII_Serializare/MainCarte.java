package com.company.SubIII_Serializare;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainCarte {

    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");

        Carte c1 = new Carte(75, sdf.parse("31-08-1982"), "1241247", "Mihnea Cioc");
        Carte c2 = new Carte(34, sdf.parse("06-03-1999"), "1234249", "Iulia Anina");
        Carte c3 = new Carte(102, sdf.parse("17-12-2005"), "1243641", "Horia Turl");

        //3a) serializare in fisierul out.txt
        FileOutputStream fos = new FileOutputStream("E:\\Facultate\\Programare avasanta pe obiecte\\TestLaborator\\Melinte_AnaMaria_233\\src\\Problema3\\out.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c1);
        oos.writeObject(c2);
        oos.writeObject(c3);
        oos.close();
        fos.close();

        //3b) metoda pt deserializare care primeste ca parametru fisieru
        deserializareFisier("E:\\Facultate\\Programare avasanta pe obiecte\\TestLaborator\\Melinte_AnaMaria_233\\src\\Problema3\\out.txt");
    }

    static void deserializareFisier(String numeFisier) throws IOException, ClassNotFoundException, IOException {
        //deserializare din fisierul out.txt
        FileInputStream fis = new FileInputStream(numeFisier);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Carte c1Deserz = (Carte) ois.readObject();
        Carte c2Deserz = (Carte) ois.readObject();
        Carte c3Deserz = (Carte) ois.readObject();

        //afisare carti
        System.out.println(c1Deserz.toString());
        System.out.println(c2Deserz.toString());
        System.out.println(c3Deserz.toString());

        ois.close();
        fis.close();
    }

}
