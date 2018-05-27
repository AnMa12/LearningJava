package com.company;

public class CoffeeMaker {

    public Coffee makeCofee() {
        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        return new Coffee(t,c);
    }

}
