package com.company;

public class Coffee {

    private int temp;
    private int conc;

    public Coffee(int temp, int conc) {
        this.temp = temp;
        this.conc = conc;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getConc() {
        return conc;
    }

    public void setConc(int conc) {
        this.conc = conc;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "temp=" + temp +
                ", conc=" + conc +
                '}';
    }
}
