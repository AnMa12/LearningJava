package com.company; /**
 * Interfete Java 7
 */
/**
 * Interfata pentru implementarea unei functii
 * care primeste ca parametru o valoare de tip double
 */
interface Functie {
    double f(double x);
}

class CalculFunctie1 implements Functie {
    @Override
    public double f(double x) {
        return x * x;
    }
}
class CalculFunctie2 implements Functie {
    double a, b, c;
    public CalculFunctie2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double f(double x) {
        return a * x * x + b * x + c;
    }
}

/**
 * Interfete Java 8
 */
interface FunctieJava8 {
    /**
     * Modificatorul de access <default> la interfetele din java 8 ofera
     posibilitatea
     * de a defini functionalitatea default (implicita) a metodei. Toate
     clasele care o implementeaza
     * vor putea apela metoda f fara a defini corpul acesteia. Clasele nu
     sunt obligate sa defineasca
     * neaparat corpul metodei f, DAR daca acesta este definit, se va
     folosi corpul din clasa
     */
    default double f(double x){
        return x;
    };
    /**
     * Modificatorul de access <static> la interfetele din java 8 ofera
     posibilitatea de a
     * defini functionalitatea implicita a metodei. Clasele care
     implementeaza aceasta interfata
     * NU POT MODIFICA corpul metodei definite ca static.
     */
    static double g(double x){
        return x*x;
    }
}
// Implementeaza interfata din java 8 cu modificatorii de acces static si default
// dar nu suprascrie functinalitatea
class CalculFunctie1Java8 implements FunctieJava8 {
}
// Implementeaza interfata din java 8 cu modificatorii de acces static si default
// si suprascrie corpul metodei default
class CalculFunctie2Java8 implements FunctieJava8 {
    // Metoda f (default in interfata) poate fi suprascrisa de clasa care
    //implementeaza interfata.
    @Override
    public double f(double x) {
        return x*x;
    }
    // Metoda g (statica in interfata) nu poate fi suprascrisa de clasa
    // care implementeaza interfata.
// @Override
// public double g(double x){
//
// }
}

public class Main {
    static double f(Functie ob, double x) {
        return ob.f(x);
    }
    public static void main(String[] args) {
        System.out.println("CalculFunctie1: " + new
                CalculFunctie1().f(5));
        System.out.println("CalculFunctie2: " + new CalculFunctie2(4, 3,
                2).f(4));
        // Afisare cu clasa anonima
        System.out.println("Calcul cu clasa anonima: " +
                f(new Functie(){
                    @Override
                    public double f(double x) {
                        return x * 2;
                    }
                }, 5)
        );
        // Afisare cu lambda expresie
        System.out.println("Calcul cu clasa anonima: " +
                f(x -> x * x * x, 5)
        );
        // Interfeta java 8
        System.out.println("Metoda f din CalculFunctie1Java8: " + new
                CalculFunctie1Java8().f(5));
        System.out.println("Metoda f din CalculFunctie2Java8: " + new
                CalculFunctie2Java8().f(5));
        // Metodele static din interfata NU SUNT mostenite de clasele care
        //o implementeaza. Acestea nu pot fi
        // folosite prin itermediul clasei.
// System.out.println("Metoda g din CalculFunctie1Java8: " +
        FunctieJava8.g(5);
// System.out.println("Metoda g din CalculFunctie2Java8: " +
        FunctieJava8.g(5);
        // Pentru folosirea metodelor statice dintr-o interfata, se
        //foloseste direct interfata
        System.out.println("Metoda g din FunctieJava8: " +
                FunctieJava8.g(10));
    }
}