package com.company.SubII_LambdaStream;



import java.util.ArrayList;

public class MainExercitiuLambdaStream {

    public static void main (String[] args) {
        Automobil a1 = new Automobil("A1","a1",
                2400,6000);
        Automobil a2 = new Automobil("A1","a2",
                2900,2000);
        Automobil a3 = new Automobil("A3","a3",
                1500,5500);

        ArrayList<Automobil> listaAutomobile= new ArrayList();
        listaAutomobile.add(a1);
        listaAutomobile.add(a2);
        listaAutomobile.add(a3);

        //afișați automobilele care costă cel puțin 5000€,
        //în ordinea descrescătoare a prețurilor;
        listaAutomobile.stream().filter(p -> p.getPret() >= 5000)
                .forEach( p -> System.out.println(p.toString()));



    }



}
