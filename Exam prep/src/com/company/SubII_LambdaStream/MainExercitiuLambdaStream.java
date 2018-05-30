package com.company.SubII_LambdaStream;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class MainExercitiuLambdaStream {

    public static void main (String[] args) {
        LinkedList<Automobil> la = new LinkedList<>();

        la.add(new Automobil("BMW", "X5", 2000.5, 5000));
        la.add(new Automobil("Mercedes", "E Class", 3500, 6000));
        la.add(new Automobil("BMW", "X6", 2800.75, 4500));
        la.add(new Automobil("BMW", "X1", 1600.5, 5000));
        la.add(new Automobil("Mercedes", "S Class", 2200.25, 15000));
        la.add(new Automobil("Audi", "A6", 2000.5, 4000));

        System.out.println("*****");
        la.stream().forEach(System.out::println);

        System.out.println("**a**");
        la.stream().filter(a -> a.getPret() >= 5000)
                   .sorted(Comparator.comparing(Automobil::getPret)
                   .reversed())
                   .forEach(System.out::println);

        System.out.println("**b**");
        la.stream().map(Automobil::getMarca)
                   .distinct()
                   .forEach(System.out::println);

        System.out.println("**c**");
        List<Automobil> ln = la.stream().filter(a -> a.getCapacitate() >= 2000 && a.getCapacitate() <= 3000)
                                        .collect(Collectors.toList());

        System.out.println("*****");
        ln.stream().forEach(System.out::println);

        System.out.println("**d**");
        la.stream().collect(groupingBy(Automobil::getMarca))
                   .forEach((m,lm) -> {
                            System.out.print(m + ": ");
                            lm.stream().map(Automobil::getModel)
                                       .forEach(x -> System.out.print(x + ", "));
                            System.out.println();
                   });


    }
}
