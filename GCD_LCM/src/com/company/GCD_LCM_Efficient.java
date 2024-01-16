package com.company;

import java.util.Scanner;

public class GCD_LCM_Efficient {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long lcm = (a*b)/gcd(a,b);
                System.out.println(gcd(a,b)+" "+lcm);
            }
        }catch (Exception e){
            return;
        }
    }
    static long gcd(long a, long b){
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
