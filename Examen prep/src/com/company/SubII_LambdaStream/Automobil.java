package com.company.SubII_LambdaStream;

import java.util.Objects;

class Automobil {

    private String marca;
    private String model;
    private int capacitate;
    private int pret;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automobil)) return false;
        Automobil automobil = (Automobil) o;
        return capacitate == automobil.capacitate &&
                pret == automobil.pret &&
                Objects.equals(marca, automobil.marca) &&
                Objects.equals(model, automobil.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(marca, model, capacitate, pret);
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", capacitate=" + capacitate +
                ", pret=" + pret +
                '}';
    }

    public Automobil(String marca, String model, int capacitate, int pret) {
        this.marca = marca;
        this.model = model;
        this.capacitate = capacitate;
        this.pret = pret;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}