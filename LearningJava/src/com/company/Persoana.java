package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Persoana implements Echipa {

    private String nume;
    private String prenume;
    private int varsta;
    private String echipa;

    public Persoana() {
        this.nume = "";
        this.prenume = "";
        this.varsta = 0;
        this.echipa = "";
    }

    public Persoana(String nume, String prenume, int varsta, String echipa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.echipa = echipa;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("E:\\GitHub\\LearningJava\\LearningJava\\src\\com\\company\\citire_date"));

        int nrStud = scan.nextInt();
        int nrProf = scan.nextInt();

        Persoana[] ArrayStudenti =  new Student[nrStud];
        Persoana[] ArrayProfesori = new Profesor[nrProf];

        //citire din fisier studenti
        for( int i = 0; i < nrStud; i++) {
            String linie = scan.nextLine();

            while(linie.isEmpty()) linie = scan.nextLine();
            String[] valoriLinie = linie.split(",");

            Student student = new Student();
                student.setNume(valoriLinie[0].trim());
                student.setPrenume(valoriLinie[1].trim());
                student.setVarsta(Integer.parseInt(valoriLinie[2].trim()));
                student.setAnStudiu(Integer.parseInt(valoriLinie[3].trim()));
                student.setNumeFacultate(valoriLinie[4].trim());
            ArrayStudenti[i] = student;
        }

        //citire din fisier profesori
        for( int i = 0; i < nrProf; i++) {
            String linie = scan.nextLine();

            while(linie.isEmpty()) linie = scan.nextLine();
            String[] valoriLinie = linie.split(",");

            Profesor profesor = new Profesor();
                profesor.setNume(valoriLinie[0].trim());
                profesor.setPrenume(valoriLinie[1].trim());
                profesor.setVarsta(Integer.parseInt(valoriLinie[2].trim()));
                profesor.setTitlu(Titlu.valueOf(valoriLinie[3].trim())); //!!!good to know
                profesor.setVechime(Integer.parseInt(valoriLinie[4].trim()));
                profesor.setCatedra(valoriLinie[5].trim());
            ArrayProfesori[i] = profesor;
        }

        //afisare in fisier
        File file = new File("E:\\GitHub\\LearningJava\\LearningJava\\src\\com\\company\\afisare");
        FileWriter writer = new FileWriter(file);
        for(int i = 0; i < nrStud; i++) {
            writer.write(ArrayStudenti[i].toString() + "\n");
            writer.flush();
        }

        for(int i = 0; i < nrProf; i++) {
            writer.write(ArrayProfesori[i].toString() + "\n");
            writer.flush();
        }

        //creare lista de persoane
        ArrayList<Persoana[]> persoane = new ArrayList<Persoana[]>();
        persoane.add(ArrayStudenti);
        persoane.add(ArrayProfesori);
        //!!!PROBLEMA LA TO STRING
        System.out.println(persoane.toString());
    }

    // --- Suprascriere Interfata ---
    @Override
    public void faceEchipa() {
        System.out.println("O persona nu poate face echipa cu alta persoana");
    }

    @Override
    public void detaliiEchipa() {
        System.out.println("O persoana nu are echipe");
    }

    @Override
    public void setEchipa(String numeEchipa) {
        this.echipa = numeEchipa;
    }

    @Override
    public String getEchipa() {
        return echipa;
    }

    public boolean equals (Persoana p1, Persoana p2) {
        return p1.nume.equals(p2.nume) &&
               p1.prenume.equals(p2.prenume) &&
               p1.varsta == p2.varsta;
    }
    // --- Suprascriere Interfata FIN ---

    // --- Suprascriere compareTo ---
    public int compareTo(Persoana persoana) {
        if (nume.equals(persoana.nume))
            return 1;
        return 0;
        //CUM FOLOSESC ASTA PENTRU CAND COMPAR PROF CU STUDENT???
    }
    // --- Suprascriere compareTo FIN ---

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    // --- Gettere si Settere ---
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }


}
