package com.company;

import java.util.Scanner;

public class Valid_Maximum {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int minAB = Math.min(a,b);
                int minBC = Math.min(b,c);
                int minCA = Math.min(c,a);
                if (minAB == minBC && minBC == minCA){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
