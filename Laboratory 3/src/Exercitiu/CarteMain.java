package Exercitiu;

import java.util.Scanner;

public class CarteMain {

    public static void main(String[] args) {
        Carte c1 = new Carte();
        c1.setAutor("Mihai Eminescu");
        System.out.println(c1.getAutor());

        int n = 0;
        System.out.println("Introduceti nr de carti");
        Scanner sc = new Scanner(System.in);
        try{
            n = sc.nextInt();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        Carte[] arrayCarti = new Carte[n];
        for(int i = 0; i < n; i++) {
            String titlu = sc.next();
            String autor = sc.next();
            String isbn = sc.next();
            int an = sc.nextInt();
            int nr = sc.nextInt();

            Carte c = new Carte(titlu, autor, isbn, an, nr);
            arrayCarti[i] = c;
        }

        for(int j=0; j<n; j++){
            System.out.println(arrayCarti[j].toString());
        }

    }

}
