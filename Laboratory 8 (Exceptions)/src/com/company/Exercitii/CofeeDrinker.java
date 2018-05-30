package com.company.Exercitii;

class CofeeDrinker{
    void drinkCofee(Cofee c){
        if(c.getTemp()>60)
            try {
                throw new TempException(c.getTemp(),"Cofee is to hot!");
            } catch (TempException e) {
                e.printStackTrace();
            }
        if(c.getConc()>50)
            try {
                throw new ConException(c.getConc(),"Cofee concentration to high!");
            } catch (ConException e) {
                e.printStackTrace();
            }
        System.out.println("Drink cofee:"+ c);
    }
}