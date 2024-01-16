package com.company;

import java.util.Scanner;

public class SecSmallSeclarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] arr = {1,2,4,7,7,5};
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>small){
                small=arr[i];
            }
        }
        int secsmall=-1;
        for (int i=0; i< arr.length; i++){
            if (arr[i] > secsmall  && arr[i] != small){
                secsmall = arr[i];
            }
        }
        System.out.println("Second Small Number is "+secsmall);
    }
}
