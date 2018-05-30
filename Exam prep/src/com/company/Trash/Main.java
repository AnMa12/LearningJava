package com.company.Trash;

import java.util.ArrayList;
import java.util.Objects;

class Automobil {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automobil)) return false;
        Automobil automobil = (Automobil) o;
        return Objects.equals(marca, automobil.marca);
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

    public String marca;
    String model;
    int capacitate;
    int pret;
}

public class Main {

    public static void main(String [] args) {
        Automobil a1 = new Automobil("A1","a1",
                2400,6000);
        Automobil a2 = new Automobil("A1","a2",
                2900,2000);
        Automobil a3 = new Automobil("A3","a3",
                1500,5500);

        ArrayList<Automobil> listaAutomobile= new ArrayList();
        listaAutomobile.add(a1);
        listaAutomobile.add(a2);
        listaAutomobile.add(a3);

        listaAutomobile.stream()
                .filter(p -> p.getPret() >= 5000)
                .forEach(p -> System.out.println(p.toString()));

        listaAutomobile.stream().filter(p -> p.getCapacitate() < 3000
                && p.getCapacitate() > 2000)
                .forEach(p -> System.out.println(p.toString()));

        System.out.println("b)");
        listaAutomobile.stream()
                .distinct()
                .forEach(p -> System.out.println(p.toString()));
    }
}