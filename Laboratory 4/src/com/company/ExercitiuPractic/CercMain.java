package com.company.ExercitiuPractic;

import java.util.Random;
import java.util.Scanner;

public class CercMain {

    public static void main(String[] args) {

        //CercExtins c1 =  new CercExtins(2,3,5);
        //CercExtins c2 =  new CercExtins(3,3,5);

        //System.out.println("Aria este: " + c1.calculrArie());
        //System.out.println("C1 este sau nu = C2: " + c1.equals(c2));

        final int N = 3;//numarul de cercuri
        Cerc c[] = new Cerc[N]; //array-ul de obiecte Cerc (clasa de baza)
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<N;i++){
            int caz = r.nextInt(2);
            if(caz == 0){
                //citeste un Cerc:
                System.out.print("raza= ");
                c[i] = new Cerc(sc.nextInt());
            } else{
                //citeste un CercExins:
                System.out.print("Introduceti raza, x si y");
                c[i] = new CercExtins(sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
        } // Afisare array:
        for(i=0;i<N;i++)
            System.out.println("Pentru cercul " + i + " se afiseaza " + c[i]);

    }

}
