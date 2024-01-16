package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Cutting_Recipes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                int count = 0;
                for (int i=0; i<n; i++){
                    if (arr[i]%arr[0]==0){
                        //System.out.print((arr[i]/arr[0])+" ");
                        count++;
                    }
                }
                for (int i=0; i<n; i++){
                    if (count == n){
                        System.out.print(arr[i]/arr[0]+" ");
                    }
                    else System.out.print(arr[i]+" ");
                }
                System.out.println();

            }
        }catch (Exception e){
            return;
        }
    }
}
