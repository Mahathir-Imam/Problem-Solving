package com.company;

import java.util.Scanner;

public class good_Quality_Bulb {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int sum = 0;
                for (int i=0; i<n-1; i++){
                    int a = sc.nextInt();
                    sum = sum + a;
                }
                int ans = (n*k) - sum;
                if (sum >= (n*k)){
                    System.out.println(0);
                }
                else System.out.println(ans);
            }
        }catch (Exception e){
            return;
        }
    }
}
