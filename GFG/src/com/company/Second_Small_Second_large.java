package com.company;

import java.util.Arrays;

public class Second_Small_Second_large {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};// when there is no duplicate element(Brute force Solution)
        int n = arr.length;
        getElement(arr, n);
    }
    static public void getElement(int[] arr, int n){
        if (n == 0 || n == 1){
            System.out.println("wtf no second small");
            System.out.println("wtf no second large");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-2];
        System.out.println("Second smallest is " +small);
        System.out.println("Second largest is " +large);
    }
}
