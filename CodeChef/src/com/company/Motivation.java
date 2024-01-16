package com.company;
import java.util.Scanner;
public class Motivation {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                long x = sc.nextLong();
                long maxRating = 0;
                for (int i=0; i<n; i++){
                    long s = sc.nextLong();
                    long r = sc.nextLong();
                    if (s<=x){
                        maxRating = Math.max(maxRating, r);
                    }
                }
                System.out.println(maxRating);
            }
        }catch (Exception e){
            return;
        }
    }
}
