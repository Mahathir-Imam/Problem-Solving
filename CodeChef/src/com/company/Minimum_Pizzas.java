package com.company;

import java.util.Scanner;

public class Minimum_Pizzas {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                if ((n*k)%4==0){
                    System.out.println((n*k)/4);
                }
                else System.out.println(((n*k)/4)+1);
            }
        }catch (Exception e){
            return;
        }
    }
}
