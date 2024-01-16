package com.company;

import java.util.Scanner;

public class Subscriptions {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                if (n<=6){
                    System.out.println(x);
                }
                else if (n%6 == 0){
                    System.out.println((n/6)*x);
                }
                else System.out.println(((n/6)+1)*x);
            }
        }catch (Exception e){
            return;
        }
    }
}
