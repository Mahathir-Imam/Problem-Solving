package com.company;

import java.util.Scanner;

public class MakeThemEqual {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int sum = 0;
                int deg = 0;
                int[] arr = new int[n];
                for (int i=0; i<n; i++){
                    arr[ i] = sc.nextInt();
                    sum = sum + arr[i];

                    deg++;
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
