package com.company;

import java.util.Scanner;

public class Expiring_Bread {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();
                if ((m*k)>=n){
                    System.out.println("Yes");
                }
                else System.out.println("No");
            }
        }catch (Exception e){
            return;
        }
    }
}
