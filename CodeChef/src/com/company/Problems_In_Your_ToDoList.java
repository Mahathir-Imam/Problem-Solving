package com.company;

import java.util.Scanner;

public class Problems_In_Your_ToDoList {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
                int count=0;
                for (int i=0; i<n; i++){
                    if (arr[i]>=1000){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }catch (Exception e){
            return;
        }
    }
}
