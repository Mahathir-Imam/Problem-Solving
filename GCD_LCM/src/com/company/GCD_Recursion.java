package com.company;

import java.util.Scanner;

public class GCD_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("GCD "+gcd(a,b)+"\nLCM "+lcm(a,b));
        }
    }
    static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
