package com.company;

import java.util.Scanner;

public class GCD_AND_LCM {
    public static void main(String[] args) {
        try {
           Scanner sc = new Scanner(System.in);
           int tc = sc.nextInt();
           while (tc-->0){
               long a = sc.nextLong();
               long b = sc.nextLong();
               long lcm = (a*b)/gcd(a,b);
               System.out.print(gcd(a,b)+" "+lcm);
               System.out.println();

           }
        }catch (Exception e){
            return;
        }
    }
    static long gcd(long a, long b){
        if (a==0){
            return b;
        }
        if (b == 0){
            return a;
        }
        if (a==b){
            return a;
        }
        if (a>b){
            return gcd(a-b,b);
        }
        return gcd(a,b-a);
    }
}
