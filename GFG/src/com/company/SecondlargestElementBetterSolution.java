package com.company;

import java.util.Scanner;

public class SecondlargestElementBetterSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for (int i=0; i<n; i++){
            if (arr[i]>largest){
                largest=arr[i];
                //break;
            }
        }
        int secLargest = -1;
        for (int i=0; i<n; i++){
            if (arr[i]>secLargest && arr[i] != largest){
                secLargest=arr[i];
            }
        }
        System.out.println("Second largest Number is "+secLargest);
    }
}
