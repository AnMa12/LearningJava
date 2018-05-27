package com.company;

public class CoffeeDrinker {

    public void drinkCoffee(Coffee c) throws TempException, ConException{
        if (c.getTemp() > 60)
            throw new TempException("Cafeaua e prea fierbinte!");
        else if(c.getConc() > 50)
            throw new ConException("Cafeaua e prea concentrata!");
        else System.out.println("Cafeaua poate sa fie bauta");
    }
}
