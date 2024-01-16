package com.company;

import java.util.Arrays;

public class Numeric_String_Array_Sort {
    public static void main(String[] args) {
        int[] arr1 = {1789,2035,1899,1456,2013,1458};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        for (int j : arr1) {
            System.out.print(j+" ");
        }
        System.out.println();
        String[] arr2 = {"A","B","C","Apple","Black Berry","dog","Cat"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        for (String j : arr2){
            System.out.print(j+" ");
        }
        
    }
}
