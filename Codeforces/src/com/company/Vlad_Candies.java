package com.company;

import java.util.Scanner;

public class Vlad_Candies {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int n = sc.nextInt();
                int[] arr = new int[n];

                for (int j=0;j<n; j++){
                    arr[j] = sc.nextInt();
                    System.out.println(arr[j]);
                }

                /*int rem ;
                for (int k=0;k<n; k++) {
                    // arr[j] = sc.nextInt();
                    rem = Math.abs(arr[k + 1] - arr[k]);
                    arr[k] = rem;
                    //}
                    if (rem == 1 || rem == 0) {
                        System.out.println("Yes");
                    } else System.out.println("No");
                }*/
            }
        }catch (Exception e){
            return;
        }
    }
}
