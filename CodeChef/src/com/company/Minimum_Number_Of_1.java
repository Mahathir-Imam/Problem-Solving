package com.company;

import java.util.Scanner;

public class Minimum_Number_Of_1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                if (n%2==0){
                    System.out.println(n/2);
                }
                else System.out.println((n/2));
            }
        }catch (Exception e){
            return;
        }
    }
}
