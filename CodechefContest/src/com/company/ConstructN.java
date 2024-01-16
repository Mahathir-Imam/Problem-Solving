package com.company;

import java.util.Scanner;

public class ConstructN {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long n = sc.nextLong();
                if (n<7 && n%2 != 0){
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
        }catch (Exception e){
            return;
        }
    }
}
