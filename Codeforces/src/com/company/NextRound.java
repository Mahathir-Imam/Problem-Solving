package com.company;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            //int sum = 0;
            int sum = 0;
            int less = 0;
            int ap;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                /*if ((arr[i] >= arr[k - 1]))  {
                    sum = sum + 1;
                }*/
                if (arr[i] < arr[k-1] || arr[i]==0)
                    less = less + 1;
            }
            ap = Math.abs(n-less);
            System.out.println(ap);
        }catch (Exception e){
            return;
        }
    }
}
