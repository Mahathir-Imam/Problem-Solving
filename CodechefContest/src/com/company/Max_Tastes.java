package com.company;

import java.util.Scanner;

public class Max_Tastes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int max1 = Math.max(a,b);
                int max2 = Math.max(c,d);
                System.out.println(max1+max2);
            }
        }catch (Exception e){
            return;
        }
    }
}
