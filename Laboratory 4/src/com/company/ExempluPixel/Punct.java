package com.company.ExempluPixel;

class Punct {
    int x, y;
    Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Punct(int x){
        this(x, x); //apel de constructor
    }
    void origine(){
        x = 0;
        y = 0;
    }
    void simetricOx(){
        y = -y;
    }

    Punct miscare(int dx, int dy){
        return new Punct(x+dx,y+dy);
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}