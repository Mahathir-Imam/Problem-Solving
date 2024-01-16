package com.company;

import java.util.Scanner;

public class Dazzling_GCD_Pairs {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a%2 == 0){
                    if ((b-a) >= 2){
                        System.out.println(a+" "+(a+2));
                    }
                    else {
                        System.out.println(-1);
                    }
                }
                else {
                    if ((b-a) >= 3){
                        if (a%3 == 0) {
                            System.out.println(a + " " + (a + 3));
                        }
                        else
                            System.out.println((a+1)+" "+(a+3));
                    }
                    else
                        System.out.println(-1);

                }
            }
        }catch (Exception e){
            return;
        }
    }
}
