package com.company.ExempluLaborator;

public class Throw{
    static void validate(int age) throws Exception {
        if(age < 18)
            throw new Exception("persoana este minora");
        else
            System.out.println("Persoana este majora");
    }

    public static void main(String args[]){
        try {
            validate(19);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Se executa si restul codului");
    }
}
