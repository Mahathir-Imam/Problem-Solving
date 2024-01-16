package com.company;

import java.util.Scanner;

public class The_Cooler_Dilemma {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int m = sc.nextInt();
                if ((x*m)<y){
                    System.out.println("YES");
                }
                else if ((x*m)>=y){
                    System.out.println("NO");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
