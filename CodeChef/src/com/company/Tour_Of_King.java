package com.company;

import java.util.Scanner;

public class Tour_Of_King {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.println((n*5)+(m*7));
            }
        }catch (Exception e){
            return;
        }
    }
}
