package com.company;

import java.util.Scanner;

public class High_Frequency {
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
                for (int i=0; i<2; i++){
                    for (int j=0; j<n-i; j++){
                        if (arr[j]>arr[j+1]){
                            String temp1 = String.valueOf(arr[j]);
                            arr[j] = arr[j+1];
                            arr[j+1] = Integer.parseInt(temp1);

                        }
                    }
                }
                int p;
                if (arr[n-1]%2 == 0){
                    p = arr[n-1]/2 + 1;
                }
                else p = arr[n-1]/2;
                System.out.println(Math.max(arr[n-1],p));
            }
        }catch (Exception e){
            return;
        }
    }
}
