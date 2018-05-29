package com.company;

public class Student {
    private long cnp;
    private String name;

    Student(String name, long cnp) {
        this.name = name;
        this.cnp = cnp;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student p = (Student) obj;
            return cnp == p.cnp;
        }
        return false;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alin", 12345);
        Student s2 = new Student("Ana", 12345);
        if (s1.equals(s2))
            System.out.println(s1 + " and " + s2 + " are equals");
        else
            System.out.println(s1 + " and " + s2 + " are NOT equals");
        if (s1 == s2) //GRESIT !
            System.out.println(s1 + " and " + s2 + " are equals");
        else
            System.out.println(s1 + " and " + s2 + " are NOT equals");

        //Comparare stringuri
        if(s1.name.equals(s2.name))
            System.out.println(s1+ " and " + s2 + " have the same names");
        else
            System.out.println(s1+ " and " + s2 + " have different names");
    }
}