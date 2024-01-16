package com.company;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int[] arr = new int[A];
            for (int i=0; i<A; i++){
                arr[i] = sc.nextInt();
            }
            for (int i=A-1; i>=0; i--){
                System.out.print(arr[i]+" ");
            }
        }catch (Exception e){
            return;
        }
    }
}
