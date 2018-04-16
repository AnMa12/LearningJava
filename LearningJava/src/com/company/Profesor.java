package com.company;

public class Profesor extends Persoana {
    Titlu titlu;
    int vechime;
    String catedra;

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
