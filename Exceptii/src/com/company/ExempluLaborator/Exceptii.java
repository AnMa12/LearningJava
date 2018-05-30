package com.company.ExempluLaborator;

public class Exceptii {
    public static void main(String[] args) {

        // ArithmeticException
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        /**int a = 20 / 0;
        System.out.println(a);
        System.out.println("codul de mai jos nu se va mai executa");*/
        /**codul de mai sus va arunca o exceptie, iar din aceasta cauza
         liniile de cod urmatoare nu se vor executa
         de aceea este important sa tratam exceptiile*/

        //In exemplul urmator exceptia a fost tratata
        try {
            int b = 20 / 0;
        } catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

        //NullPointerException
        //Exception in thread "main" java.lang.NullPointerException
        /**String s1 = null; System.out.println(s1.length());*/

         try{
            String s1 = null;
            System.out.println(s1.length());
         } catch (NullPointerException e){
            System.out.println("Errror: " + e.getMessage());
         }

        //NumberFormatException
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        //at java.lang.NumberFormatException.forInputString
        /**String s2 = "abc";
        int i = Integer.parseInt(s2);*/

        try {
            String s2 = "abc";
            int i = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //ArrayIndexOutOfBoundsException
        //Exception in thread "main"
        //java.lang.ArrayIndexOutOfBoundsException: 6
        /**int b[] = new int[5];
        b[6] = 10;*/

        int b[] = new int[5];
        try {
            b[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Codul inca merge");
    }
}
