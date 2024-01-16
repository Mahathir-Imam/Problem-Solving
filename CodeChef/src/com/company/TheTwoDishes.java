package com.company;

import java.util.Scanner;

public class TheTwoDishes {
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
                    System.out.println(Math.abs(s-n-n));
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
