package com.company;

import java.util.Scanner;

public class Test_Averages {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if ((a+b)/2 < 35 || (a+c)/2 < 35 || (c+b)/2 < 35){
                    System.out.println("FAIL");
                }
                else System.out.println("PASS");
            }
        }catch (Exception e){
            return;
        }
    }
}
