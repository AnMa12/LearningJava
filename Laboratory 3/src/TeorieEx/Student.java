package TeorieEx;

public class Student {
    int nrMatricol;
    String nume;
    static String denumireFacltate = "FMI";

    public Student() {

    }

    public Student(int nrMatricol, String nume) {
        this.nrMatricol = nrMatricol;
        this.nume = nume;
    }

    public Student(Student s) {
        s.nrMatricol = this.nrMatricol;
        s.nume = this.nume;
    }


    public void setNrMatricol(int nrMatricol) {
        this.nrMatricol = nrMatricol;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public int getNrMatricol() {
        return nrMatricol;
    }
}
