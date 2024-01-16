package com.company;

import java.util.Scanner;

public class Drunk_Alcoholic {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int k = sc.nextInt();
                if (k%2==0){
                    System.out.println(k);
                }
                else {
                    System.out.println(k+2);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
