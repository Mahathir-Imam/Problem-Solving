package com.company;

import java.util.Scanner;

public class EconomicClass {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int n = sc.nextInt();
                int[] arr1 = new int[n];
                int[] arr2 = new int[n];
                for (int j=0; j<n; j++){
                    arr1[j] = sc.nextInt();

                }
                for (int j=0; j<n; j++){
                    arr2[j] = sc.nextInt();
                }
                int count = 0;
                for (int j=0; j<n; j++){

                    if (arr1[j] == arr2[j]){
                        count = count + 1;
                    }
                }
                System.out.println(count);
            }
        }catch (Exception e){
            return;
        }
    }
}
