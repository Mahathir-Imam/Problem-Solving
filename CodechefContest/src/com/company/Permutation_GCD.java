package com.company;

import java.util.Scanner;

public class Permutation_GCD {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                if (x<n){
                    System.out.println("-1");
                    continue;
                }
                System.out.print(((x-n)+1)+" ");
                for (int i=1; i<=n; i++){
                    if (i !=((x-n)+1)){
                        System.out.print(i+" ");
                    }
                }
                System.out.println();

            }
        }catch (Exception e){
            return;
        }
    }
}
