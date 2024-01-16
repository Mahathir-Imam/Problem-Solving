package com.company;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr1 = {10,20,50,60,30,40};
        String[] arr2 = {"Java","Python","PHP","C#","C","C++"};

        System.out.println("Original : "+ Arrays.toString(arr1));
        //Arrays.sort(arr1);
        //System.out.println("Sorted Array : "+Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.print("Sorted : ");
        for (int a : arr1){
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("Original : "+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted : "+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.print("Sorted : ");
        for (String b: arr2){
            System.out.print(b+ " ");
        }
        System.out.println();
    }
}
