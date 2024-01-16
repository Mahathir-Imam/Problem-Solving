package com.company;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                float p = sc.nextFloat();
                float y = sc.nextFloat();
                float r1 = sc.nextFloat();
                float r2 = sc.nextFloat();
                float rr1 = r1/100;
                float si = p*y*rr1;
                float rr2 = r2/100;
                float ci = (float) ((p*(Math.pow((1+rr2),y)))-p);
                if (si<ci){
                    System.out.println("Bank 1");
                }
                else if (si>ci){
                    System.out.println("Bank 2");
                }
                else System.out.println("Confused huh!");

            }
        }catch (Exception e){
            return;
        }
    }
}
