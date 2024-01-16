package com.company;

import java.util.Scanner;

public class Dazzling_AXNODR_Challenge {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            long ans = 0;
            while (tc-->0){
                long n = sc.nextLong();
                if (n%2 == 0){
                    if (n%4 == 0){
                        ans = 3^n;
                    }
                    else ans=3;
                }
                else {
                    if ((n-1)%4 == 0){
                        ans = (3^(n-1)) & n;
                    }
                    else
                        ans = 3;
                }
                System.out.println(ans);
            }
        }catch (Exception e){
            return;
        }
    }
}
