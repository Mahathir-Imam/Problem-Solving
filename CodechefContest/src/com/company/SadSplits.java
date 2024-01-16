package com.company;

import java.util.Scanner;

public class SadSplits {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int sum = 0;

                for (int j = 0; j < n; j++) {
                    arr[j] = sc.nextInt();
                }
                for (int k = 0; k < n; k++) {
                    sum = 0;
                    sum = sum + (arr[k] * arr[k + 1]);

                }
                System.out.println(sum);
                //System.out.println(sum);


            }
        }catch (Exception e){
            return;
        }
    }
}

