package com.company;

import java.util.Scanner;

public class Dark_Light {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long n = sc.nextLong();
                int k = sc.nextInt();
                if (n==0 && k==1){
                    System.out.println("On");
                }
                else if (n>1 && k==1){
                    System.out.println("Ambiguous");
                }
                else if (k==0 && n>1){
                    if (n%4==0){
                        System.out.println("Off");
                    }
                    else System.out.println("On");
                }
                else if (n==0 && k==0){
                    System.out.println("Off");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
