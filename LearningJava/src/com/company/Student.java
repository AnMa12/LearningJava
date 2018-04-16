package com.company;

public class Student extends Persoana {
    private int anStudiu;
    private String numeFacultate;

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

    @Override
    public String toString() {
        return "Student{" +
                "anStudiu=" + anStudiu +
                ", numeFacultate='" + numeFacultate + '\'' +
                '}';
    }

    public int compareTo(Student student) {
        if( this.getNume().compareTo(student.getNume()) < 0) {

        }
    }

    public Student() {

    }

    public Student(String nume, String prenume, int varsta, int anStudiu, String numeFacultate) {
        super(nume, prenume, varsta);
        this.anStudiu = anStudiu;
        this.numeFacultate = numeFacultate;
    }
}
