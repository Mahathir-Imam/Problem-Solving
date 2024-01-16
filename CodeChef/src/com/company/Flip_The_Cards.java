package com.company;

import java.util.Scanner;

public class Flip_The_Cards {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                System.out.println(Math.min((n-x),x));
            }
        }catch (Exception e){
            return;
        }
    }
}
