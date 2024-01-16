package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] k = runningSum(arr);
        System.out.println(Arrays.toString(k));

    }
    static int[] runningSum(int[] nums){
        for (int i=1; i< nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
