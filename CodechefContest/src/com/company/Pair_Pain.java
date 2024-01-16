package com.company;

import java.util.Scanner;

public class Pair_Pain{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                int count=0;
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }

                for (int j=0; j<n; j++){
                    for (int k=j+1; k<n+1; k++){
                        if (arr[j]+arr[k] >= arr[j]*arr[k]){
                            count++;
                        }

                    }
                    System.out.println(count);
                }
                //System.out.println(count);
            }
        }catch (Exception e){
            return;
        }
    }
}
