package com.company;

public class Student extends Persoana implements Echipa{
    private int anStudiu;
    private String numeFacultate;

    public Student() {
        super("", "", 0, "");
        this.anStudiu = 0;
        this.numeFacultate = "";
    }

    public Student(String nume, String prenume, int varsta, String echipa, int anStudiu, String numeFacultate) {
        super(nume, prenume, varsta, echipa);
        this.anStudiu = anStudiu;
        this.numeFacultate = numeFacultate;
    }

    @Override
    public void faceEchipa(Student s2) {
        if(this.anStudiu == s2.anStudiu) {
            if(!this.getEchipa().equals("")) //daca s1 are echipa
                s2.setEchipa(this.getEchipa());
            else if(this.getEchipa().equals("") && !s2.getEchipa().equals(""))
                this.setEchipa(s2.getEchipa());
            else if(this.getEchipa().equals("") && s2.getEchipa().equals("")) {
                String numeEchipa = "echipa_" + this.getNume() + "_" + s2.getNume();
                this.setEchipa(numeEchipa);
                s2.setEchipa(numeEchipa);
            }
        } else System.out.println("Cei doi studenti nu sunt in acelasi an de studiu");
    }

    @Override
    public void detaliiEchipa() {
        if(!this.getEchipa().equals(""))
            System.out.println(this.getPrenume() + this.getNume() + "nu are echipa");
        else
            System.out.println(this.getPrenume() + this.getNume() +
                        "face parte din echipa" + this.getEchipa());
    }

    public int compareTo(Student student) {
        if( this.getNume().compareTo(student.getNume()) < 0)
            return -1;
        else if ( this.getNume().compareTo(student.getNume()) == 0) {
            if (this.getPrenume().compareTo(student.getPrenume()) < 0)
                return -1;
            else if (this.getPrenume().compareTo(student.getPrenume()) == 0) {
                return Integer.compare(this.anStudiu, student.anStudiu);
            } else return 1;
        }
        else return 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "anStudiu=" + anStudiu +
                ", numeFacultate='" + numeFacultate + '\'' +
                '}';
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }

    public void setNumeFacultate(String numeFacultate) {
        this.numeFacultate = numeFacultate;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public String getNumeFacultate() {
        return numeFacultate;
    }
}
