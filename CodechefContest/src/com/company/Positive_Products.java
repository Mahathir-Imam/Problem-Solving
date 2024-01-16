package com.company;

import java.util.Scanner;

public class Positive_Products {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                //int[] arr = new int[n];
                int ans=0;
                int pos=0;
                int neg=0;
                for (int i=0; i<n; i++){
                   int a = sc.nextInt();
                   if (a<0){
                       ans = ans + neg;
                       neg++;
                   }
                   else if (a>0){
                       ans = ans + pos;
                       pos++;
                   }
                }
                System.out.println(ans);

            }
        }catch (Exception e){
            return;
        }
    }
}
