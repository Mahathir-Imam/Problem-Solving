package com.company;

import java.util.Scanner;

public class Odd_Sum_Pair {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if ((a+b)%2!=0 || (a+c)%2!=0 || (b+c)%2 != 0){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
