package com.company;

public class Masini {
    private int nrUsi;
    private int capacitate;

    public Masini(int nrUsi, int capacitate) {
        this.nrUsi = nrUsi;
        this.capacitate = capacitate;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    @Override
    public String toString() {
        return "Masini{" +
                "nrUsi=" + nrUsi +
                ", capacitate=" + capacitate +
                '}';
    }
}
