package com.company;

import java.util.Scanner;

public class Minimum_Num_Of_Pizza {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = Integer.parseInt(sc.next());
                int k = Integer.parseInt(sc.next());
                int p = 1;
                if (n!=k){
                    p = n/gcd(n,k);
                }
                System.out.println(p);

            }
        }catch (Exception e){
            return;
        }
    }
    public static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        else
            return gcd(b%a,a);
    }
}
