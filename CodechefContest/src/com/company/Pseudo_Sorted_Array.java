package com.company;

import java.util.Scanner;

public class Pseudo_Sorted_Array {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                    if (arr[i-1]>arr[i] && i>=1){

                    }
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
