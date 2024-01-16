package com.company;

import java.util.Scanner;

public class ATMMachine2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = new int[n];
                for (int j=0; j<n; j++){
                    arr[j] = sc.nextInt();
                }
                int mo = k;
                for (int j=0; j<n; j++){
                    if (arr[j] <= mo){
                        System.out.print(1);
                        mo = mo - arr[j];
                    }
                    else  if (arr[j] > mo ){
                        System.out.print(0);
                    }
                }
                System.out.println();
            }
        }catch (Exception e){
            return;
        }
    }
}
