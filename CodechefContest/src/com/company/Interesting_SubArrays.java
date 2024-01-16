package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Interesting_SubArrays {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            long tc = sc.nextLong();
            while (tc-->0){
               long n = sc.nextLong();
               long[] arr = new long[(int) n];
               for (long i=0; i<n; i++){
                   arr[(int) i] = sc.nextLong();
               }
               Arrays.sort(arr);
               long mini = Integer.MAX_VALUE;
               long maxi = Integer.MIN_VALUE;
               maxi = Math.max((arr[0]*arr[0]),arr[(int) (n-1)]*arr[(int) (n-1)]);
               if (arr[0]<0 && arr[(int) (n-1)]>0){
                   mini = arr[0]*arr[(int) (n-1)];
               }
               else if (arr[0]>=0){
                   mini = arr[0]*arr[0];
               }
               else {
                   mini = arr[(int) (n-1)]*arr[(int) (n-1)];
               }
                System.out.println(mini+" "+maxi);
            }
        }catch (Exception e){
            return;
        }
    }
}
