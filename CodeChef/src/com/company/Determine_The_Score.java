package com.company;

import java.util.Scanner;

public class Determine_The_Score {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int n = sc.nextInt();
                System.out.println((x/10)*n);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
