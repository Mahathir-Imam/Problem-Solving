package com.company;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                String s = String.valueOf(n);
                if (s.contains("7")){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
