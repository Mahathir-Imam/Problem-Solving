package com.company;

import java.util.Scanner;

public class Cost_Of_Groceries {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int[] arr1 = new int[n];
                int[] arr2 = new int[n];
                int sum=0;
                for (int i=0; i<n; i++){
                    arr1[i] = sc.nextInt();
                }
                for (int j=0; j<n; j++){
                    arr2[j] = sc.nextInt();
                }
                for (int k=0; k<n; k++){
                    if (arr1[k]>=x){
                        sum = sum+arr2[k];
                    }
                }
                System.out.println(sum);

            }
        }catch (Exception e){
            return;
        }
    }
}
