package com.company;

import java.util.Scanner;

public class Minimum_Sum {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long n = sc.nextLong();
                long x = sc.nextLong();
                for (int i=1; i<n; i++){
                    long t = sc.nextLong();
                    x = nope(x, t);
                }
                System.out.println(x*n);
            }
        }catch (Exception e){
            return;
        }
    }
    public static long nope(long a, long b){
        if (b==0){
            return  a;
        }
        return nope(b, a%b);
    }
}
