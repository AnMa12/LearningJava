package com.company.Exercitii;

class ConException extends Exception{
    int c;
    public ConException(int c,String msg) {
        super(msg);
        this.c = c;
    }
    int getConc(){
        return c;
    }
}