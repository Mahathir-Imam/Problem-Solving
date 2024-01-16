package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SameOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in first Array : ");
        int a1 = sc.nextInt();
        int[] arr1 = new int[a1];
        System.out.println("Enter the first Array : ");
        for (int i=0; i<a1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in second Array : ");
        int b1 = sc.nextInt();
        int[] arr2 = new int[b1];
        System.out.println("Enter the second Array : ");
        for(int j=0; j<b1; j++){
            arr2[j] = sc.nextInt();
        }

        if (equal(arr1,arr2)){
            System.out.println("Both are same");
        }
        else System.out.println("Both are not same");
    }

    public static  boolean equal(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i=0; i< arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return  false;
            }
        }
        return true;
    }
}
