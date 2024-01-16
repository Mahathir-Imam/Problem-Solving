package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Maximum_Number {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int[] arr = new int[3];
                for (int i=0; i<3; i++){
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(arr[1]);
            }
        }catch (Exception e){
            return;
        }
    }
}
