package com.company.SubII_StreamLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class MainLog {

    public static void main(String[] args) {

        Log l1 = new Log("U1",10, 9, 16);
        Log l2 = new Log("U2",5, 10, 11);
        Log l3 = new Log("U3",5, 12, 18);
        Log l4 = new Log("U4",6, 6, 9);

        ArrayList<Log> logList = new ArrayList<>();
        logList.add(l1);
        logList.add(l2);
        logList.add(l3);
        logList.add(l4);

        System.out.println("a");
        logList.stream().filter(p -> p.getLogout_time() - p.getLogin_time() > 1)
                .forEach(System.out::println);

        System.out.println("b");
        logList.stream().map(Log::getDate)
                .distinct()
                .forEach(System.out::println);

        System.out.println("c");
        //care s-au conectat in ziua de 5 logat pana in ora 11 alfabetic
        List<Log> newLogList = logList.stream().filter( p -> p.getDate() == 5 && p.getLogin_time() < 11)
                .sorted(Comparator.comparing(Log::getUser))
                .collect(Collectors.toList());
        System.out.println(newLogList);

        System.out.println("d");
        //pentru fiecare utilizator, zilele in care s-a conectat la server
        logList.stream().collect(groupingBy(Log::getUser))
                .forEach((user, logList2) -> {
                    System.out.print(user + " ");
                    logList2.stream().map(Log::getDate)
                            .forEach(p -> System.out.print(p + ", "));
                    System.out.println();
                });

    }
}
