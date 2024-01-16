package com.company;

import java.util.Scanner;

public class EnoughSpace {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (((1*x)+(2*y))<=n){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
