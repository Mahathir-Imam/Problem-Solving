package com.company;

import java.util.Scanner;

public class Expert_Setter {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                float div = x/2;
                if (div<=y){
                    System.out.println("YES");
                }
                else System.out.println("NO");


            }
        }catch (Exception e){
            return;
        }
    }
}
