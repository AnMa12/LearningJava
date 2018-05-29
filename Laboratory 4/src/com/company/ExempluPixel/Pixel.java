package com.company.ExempluPixel;

class Pixel extends Punct {
    String culoare; //mosteneste x si y
    Pixel(int x, int y, String culoare){
        super(x,y);
        this.culoare = culoare;
    }

    Pixel(int x, String culoare){
        this(x,x,culoare);
    }

    // Pixel(){} – invoca implicit constructorul fara parametrii din Punct() – super()

    void origine(){ //redefinita - se pot redefini si metodele
        super.origine();
        culoare = "alb";
    }
    Pixel miscare(int dx, int dy){ //difera tip returnat - tipul este Pixel
        return new Pixel(x+dx,y+dy, culoare);
    }
    public String toString(){//redefinita
        return super.toString() + " culoare " + culoare;
    }
}