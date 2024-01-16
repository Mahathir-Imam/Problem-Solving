package com.company;

import java.util.Scanner;

public class Count_ACs {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x==0){
                    System.out.println("0");
                }
                else if (x<=10){
                    System.out.println(x);
                }
                else if (x>=100 && ((x%100)+(x/100))<=10){
                    System.out.println((x%100)+(x/100));
                }
                else System.out.println("-1");
            }
        }catch (Exception e){
            return;
        }
    }
}
