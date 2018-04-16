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

    public Student() {
        this.anStudiu = 0;
        this.numeFacultate = "";
    }

    public Student(String nume, String prenume, int varsta, int anStudiu, String numeFacultate) {
        super(nume, prenume, varsta);
        this.anStudiu = anStudiu;
        this.numeFacultate = numeFacultate;
    }
}
