package com.company;

import java.util.Scanner;

public class Farmer_And_His_Plot {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int l = sc.nextInt();
                int b = sc.nextInt();
                int sqr_count = (l*b)/(gcd(l,b)*gcd(l,b));
                System.out.println(sqr_count);
            }
        }catch (Exception e){
            return;
        }
    }
    static int gcd(int l, int b){
        if ( b == 0){
            return l;
        }
        return gcd(b,l%b);
    }
}
