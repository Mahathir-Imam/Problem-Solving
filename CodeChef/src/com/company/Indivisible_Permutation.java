package com.company;

import java.util.Scanner;

public class Indivisible_Permutation {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                for (int i=1; i<n; i++){
                    System.out.print((i+1)+" ");
                }
                System.out.print(1);
                System.out.println();
            }
        }catch (Exception e){
            return;
        }
    }
}
