package com.company;

import java.util.Scanner;

public class Two_Trains {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int[] arr1 = new int[n];
                arr1[0] = 0;
                int[] arr2 = new int[n];
                arr2[0] = 0;
                int sum = 0,dif,i;
                for (i=1;i<n; i++){
                    arr1[i] = sc.nextInt();
                    sum = sum + arr1[i];
                    arr2[i]=arr1[i];
                    arr1[i] = sum;
                }
                for (i=0; i<n-1; i++){
                    dif = arr1[i+1] - arr2[i];
                    if (dif>0){
                        arr2[i+1] = arr2[i] + dif + arr2[i+1];
                    }
                    else {
                        arr2[i+1] = arr2[i] + arr2[i+1];
                    }

                }
                System.out.println(arr2[i]);

            }
        }catch (Exception e){
            return;
        }
    }
}
