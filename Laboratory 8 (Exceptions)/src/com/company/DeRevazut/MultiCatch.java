package com.company.DeRevazut;

public class MultiCatch{
    public static void main(String args[]){
         try{
            int a[] = new int[5];
            a[10] = 20/0;
         }
         //catch(Exception e){System.out.println("tratarea exceptiilor la modul general");}
         //daca e pusa la inceput nu mai merg celelalte!!!
         catch(ArithmeticException e){
             System.out.println("exceptia 20/0 ");
         } /**SE EXCEUTA DOAR UNA SPECIFICA ???*/
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exceptia a[10]");
         }
         catch(Exception e){
            System.out.println("tratarea exceptiilor la modul general");}
            System.out.println("se executa restul de cod");
         }
}
