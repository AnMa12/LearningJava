package com.company.ExempluLaborator;

public class Teorie {

    public static void main(String[] args) {
        /** Doua tipuri de sintaxa */

        try{
            int b = 20/2;
        }catch(Exception e) {
            /**COD CARE SE EXECUTA CAND APAR EXCEPTII */
            System.out.println(e.getMessage());
        }

        /** sau */

        try{
            int b = 20/2;
        }finally{
            /**COD CARE SE EXECUTA INDIFERENT DACA APAR SAU NU EXCEPTII */
            System.out.println("haha m-am excutat oricum");
        }
    }



}
