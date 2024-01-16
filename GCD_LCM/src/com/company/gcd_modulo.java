package com.company;

import java.util.Scanner;

public class gcd_modulo {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int lcm = (a*b)/gcd(a,b);
            System.out.println("GCD is "+gcd(a,b));
            System.out.println("LCM is "+lcm);
        }catch (Exception e){
            return;
        }
    }
    static int gcd(int a, int b){
        while (a != 0 && b != 0){
            if (a>b){
                a = a%b;
            }
            else b = b%a;
        }
        return Math.max(a,b);
    }
}
