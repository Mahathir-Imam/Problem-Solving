package com.company;

import java.util.Scanner;

public class Permutation_Median {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = n;
                int med = 1;
                for (int i=0; i<n; i++){
                    if (i%2 == 0){
                        System.out.print(x-- +" ");
                    }
                    else System.out.print(med++ + " ");
                }
                System.out.println();
            }
        }catch (Exception e){
            return;
        }
    }
}
