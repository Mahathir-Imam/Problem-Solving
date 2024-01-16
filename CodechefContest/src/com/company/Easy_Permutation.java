package com.company;

import java.util.Scanner;

public class Easy_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0){
            int n = sc.nextInt();
            for (int i=0; i<n; i++){
                System.out.print(n-i+" ");
            }
            System.out.println();
        }
    }
}
