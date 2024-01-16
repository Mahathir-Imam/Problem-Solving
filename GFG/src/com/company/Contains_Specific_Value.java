package com.company;

import java.util.Scanner;

public class Contains_Specific_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Contains(arr,20));
        System.out.println(Contains(arr,30));
        System.out.println(Contains(arr,40));
    }
    public static boolean Contains(int[] arr, int item){
        for(int i=0; i< arr.length; i++){
            if (item == arr[i]){
                return true;
            }
        }
        return false;
    }
}
