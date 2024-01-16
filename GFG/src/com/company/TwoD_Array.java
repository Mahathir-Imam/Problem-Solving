package com.company;

import java.util.Arrays;

public class TwoD_Array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        ConvertArrayToString(arr);
    }
    public static void ConvertArrayToString(int[][] arr){
        for (int i=0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
