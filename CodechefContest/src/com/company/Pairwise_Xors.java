package com.company;

import java.util.Scanner;

public class Pairwise_Xors {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long n = sc.nextLong();
                long a = n & ~(n-1);
                /*if (n&1 || n==a){

                }*/
            }
        }catch (Exception e){
            return;
        }
    }
}
