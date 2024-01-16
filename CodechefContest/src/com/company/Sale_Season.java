package com.company;

import java.util.Scanner;

public class Sale_Season {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int cost = sc.nextInt();
                if (cost<=100){
                    System.out.println(cost);
                }
                else if (cost<=1000){
                    System.out.println(cost-25);
                }
                else if (cost<=5000){
                    System.out.println(cost-100);
                }
                else {
                    System.out.println(cost-500);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
