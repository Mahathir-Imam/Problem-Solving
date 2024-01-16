package com.company;

import java.util.Scanner;

public class Score_High {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                if ((a+b+c+d)==n){
                    int max1 = Math.max(a, b);
                    int max2 = Math.max(c,d);
                    System.out.println(Math.max(max1,max2));
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
