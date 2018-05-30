package com.company.Exercitii;

public class OrdineaExceptiilor {
    static void metoda() {
        throw new IllegalArgumentException();
        //throw new NullPointerException();
    }

    public static void main(String[] args) {
        try
        {
            metoda();
        }
        catch (NullPointerException ex)
        {
            System.out.print("NPE ");
        }
        catch (Exception ex)
        {
            System.out.print("EX ");
        }
        finally
        {
            System.out.print("FIN ");
        }
        System.out.println("END");
    }
}
