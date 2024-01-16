package com.company;

import java.util.Scanner;

public class Divisible_By_K {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long n = sc.nextLong();
                long k = sc.nextLong();
                long[] a = new long[(int) n];
                long product = 1;
                for (int i=0; i<n; i++){
                    a[i] = sc.nextLong();
                }
                for (int i=0; i<n; i++){
                    product = product*a[i]%k;

                }
                if (product==0){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
