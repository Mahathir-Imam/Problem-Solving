package com.company;

import java.util.Scanner;

public class Rain_In_ChefLand {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x<3){
                    System.out.println("LIGHT");
                }
                else if (x<7){
                    System.out.println("MODERATE");
                }
                else System.out.println("HEAVY");
            }
        }catch (Exception e){
            return;
        }
    }
}
