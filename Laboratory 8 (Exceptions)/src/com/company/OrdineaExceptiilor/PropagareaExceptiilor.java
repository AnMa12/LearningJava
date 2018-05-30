package com.company.OrdineaExceptiilor;

class PropagareaExceptiilor{
    void m(){
        int x = 20/0;
    }

    void n(){
        m();
    }

    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Se executa exceptia");
        }
    }

    public static void main(String args[]){
        PropagareaExceptiilor obj = new PropagareaExceptiilor();
        obj.p();
    }
}
/**
 * pe stiva vor fi plasate in ordinea: main(), p(), n(), m() (de jos in
 sus)
 * in acest exemplu exceptia apare in metoda m() dupa care se propaga in
 n()
 * apoi in p(), aici fiind si prinsa de blocul catch
 */
