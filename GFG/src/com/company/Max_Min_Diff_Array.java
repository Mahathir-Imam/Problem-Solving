package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Min_Diff_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max_dif = arr[n-1] - arr[0];
        int min_dif = arr[1]-arr[0];
        System.out.println("Maximum value : "+max_dif);
        System.out.println("Minimum value : "+min_dif);
    }
}
