package com.company;

import java.util.Scanner;

public class Binary_Battles {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int count=0;
                while (n>1){
                    n=n/2;
                    count++;
                }
                System.out.println((count*a)+((count-1)*b));
            }
        }catch (Exception e){
            return;
        }
    }
}
