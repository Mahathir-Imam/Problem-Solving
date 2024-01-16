package com.company;

import java.util.Scanner;

public class Bidding {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if (a>b && a>c){
                    System.out.println("Alice");
                }
                else if (b>a && b>c){
                    System.out.println("Bob");
                }
                else System.out.println("Charlie");
            }
        }catch (Exception e){
            return;
        }
    }
}
