package com.company.Exercitii;

class TempException extends Exception{
    int t;
    public TempException(int t,String msg) {
        super(msg);
        this.t = t;
    }

    int getTemp(){
        return t;
    }
}