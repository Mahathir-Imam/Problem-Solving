package com.company;

import java.util.Scanner;



public class Prime_Sum {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long a = sc.nextLong();
                long b = sc.nextLong();
                if (b==1 || a==1){
                    System.out.println(-1);
                }
                else if (gcd(a,b)==1){
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
        }
        catch (Exception e){
            return;
        }
    }
    public  static long gcd(long a, long b){
        while (b%a !=0){
            long t=b%a;
            b=a;
            a=t;
        }
        return a;
    }


}
