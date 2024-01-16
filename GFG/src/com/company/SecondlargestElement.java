package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SecondlargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Duplicate element available(Brute Force)
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int largest = arr[n-1];
        int secondlargest = -1;
        for (int i=n-2; i>=0; i--){
            if (arr[i] != largest){
                secondlargest = arr[i];
                break;
            }
        }
        System.out.println("Second largest Number is "+ secondlargest);
    }
}
