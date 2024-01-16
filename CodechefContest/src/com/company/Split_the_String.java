package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Split_the_String {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
               long n = sc.nextLong();
               int[] arr = new int[(int) n];
               for (int i=0; i<n; i++){
                   arr[i] = sc.nextInt();
               }
                Arrays.sort(arr);
            }
        }catch (Exception e){
            return;
        }
    }
}
