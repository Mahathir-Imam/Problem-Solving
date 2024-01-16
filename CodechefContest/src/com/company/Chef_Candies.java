package com.company;

import java.util.Scanner;

public class Chef_Candies {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                if (n<=x){
                    System.out.println(0);
                }
                else if ((n-x)%4 == 0){
                    System.out.println((n-x)/4);
                }
                else if ((n-x)%4 != 0){
                    System.out.println(((n-x)/4)+1);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
