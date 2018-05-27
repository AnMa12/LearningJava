package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        try{
            x = sc.nextInt();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
