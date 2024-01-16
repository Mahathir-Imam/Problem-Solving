package com.company;

import java.util.Scanner;

public class ArraylargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i=0; i< arr.length; i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
            if (arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest is "+largest+" and Smallest is "+smallest);
    }
}
