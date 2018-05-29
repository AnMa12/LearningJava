package com.company.ExempluPixel;

public class ExempluPunctPixel {
    public static void main(String arg[]){
        Punct p = new Punct(5);
        System.out.println(p);
        System.out.println(p.miscare(-1,3));
//miscare returneaza un Punct
        Pixel px = new Pixel(2,3,"rosu");
        System.out.println(px);
        System.out.println(px.miscare(-1,3));
//miscare returneaza acum un Pixel
        px.simetricOx();//mostenita de la Punct
        System.out.println(px);
        px.origine();
        System.out.println(px);
    }
}