package com.company;

import java.util.Scanner;

public class The_two_Dishes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int s = sc.nextInt();
                if (n>=s){
                    System.out.println(s);
                }
                else {
                    System.out.println(s-n);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
