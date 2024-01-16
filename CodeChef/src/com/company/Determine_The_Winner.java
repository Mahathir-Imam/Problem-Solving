package com.company;

import java.util.Scanner;

public class Determine_The_Winner {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int Pa = sc.nextInt();
                int Pb = sc.nextInt();
                int Qa = sc.nextInt();
                int Qb = sc.nextInt();
                if ((Math.max(Pa,Pb))==((Math.max(Qa,Qb)))){
                    System.out.println("TIE");
                }
                else if ((Math.max(Pa,Pb))<((Math.max(Qa,Qb)))){
                    System.out.println("P");
                }
                else System.out.println("Q");
            }
        }catch (Exception ignored){
        }
    }
}
