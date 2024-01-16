package com.company;

import java.util.Scanner;

public class CopyArrayStoreReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int j=0;
        for (int i = b.length-1; i>=0; i--){
            b[i] = a[j];
            j++;
        }
        for (int i=0; i<b.length; i++){
            System.out.print("The value of b [ "+i+" ] is "+b[i]);
        }
    }
}
