package com.company.Exercitii;

public class MainCofee {

    public static void main(String[] args) {
        CofeeMaker mk = new CofeeMaker();
        CofeeDrinker d = new CofeeDrinker();
        for(int i = 0;i<5;i++){
            Cofee c = mk.makeCofee();
            try {
                d.drinkCofee(c);
            } catch (TempException e) {
                System.out.println("Exception:" +
                        e.getMessage() + " temp=" + e.getTemp());
            } catch (ConException e) {
                System.out.println("Exception:" +
                        e.getMessage() + " conc=" + e.getConc());
            }
            finally{
                System.out.println("Throw the cofee cup.\n");
            }
        }

    }
}
