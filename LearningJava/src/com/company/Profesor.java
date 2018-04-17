package com.company;

public class Profesor extends Persoana implements Echipa{
    Titlu titlu;
    int vechime;
    String catedra;

    @Override
    public void faceEchipa(Profesor p2) {
        if(this.getCatedra().equals(p2.getCatedra())) {
            if(!this.getEchipa().equals(""))
                p2.setEchipa(this.getEchipa());
            else if(this.getEchipa().equals("") && !p2.getEchipa().equals(""))
                this.setEchipa(p2.getEchipa());
            else System.out.println("Nu se poate aloca o materie de predat pentru profesori");
        }
        else System.out.println("Profesorii nu pot face echipa, nu sunt din aceeasi catedra");
    }

    @Override
    public void detaliiEchipa() {
        if(this.getEchipa().equals(""))
            System.out.println("Profesroul " + this.getNume() + " " +
                    this.getPrenume() + " nu are echipa");
        else System.out.println("Profesroul " + this.getNume() + " " +
                this.getPrenume() + " preda materia " + this.getEchipa());
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "titlu=" + titlu +
                ", vechime=" + vechime +
                ", catedra='" + catedra + '\'' +
                '}';
    }

    public int compareTo(Profesor profesor) {
        if( this.getNume().compareTo(profesor.getNume()) < 0)
            return -1;
        else if (this.getNume().compareTo(profesor.getNume()) == 0){
            if(this.getTitlu().compareTo(profesor.getTitlu()) < 0)
                return -1;
            else if(this.getTitlu().compareTo(profesor.getTitlu()) == 0) {
                if(this.vechime < profesor.vechime)
                    return -1;
                else if(this.vechime == profesor.vechime)
                    return 0;
                else return 1;
            }
            else return 1;
        }
        else return 1;
    }

    public void setTitlu(Titlu titlu) {
        this.titlu = titlu;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public Titlu getTitlu() {
        return titlu;
    }

    public int getVechime() {
        return vechime;
    }

    public String getCatedra() {
        return catedra;
    }

    public Profesor() {
        this.vechime = 0;
        this.catedra = "";

    }

    public Profesor(String nume, String prenume, int varsta, Titlu titlu, int vechime, String catedra) {
        super(nume, prenume, varsta);
        this.titlu = titlu;
        this.vechime = vechime;
        this.catedra = catedra;
    }
}
