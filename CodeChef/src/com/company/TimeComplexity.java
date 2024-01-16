package com.company;

import java.util.Scanner;

public class TimeComplexity {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x<=y){
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
        }catch (Exception e){
            return;
        }
    }
}
