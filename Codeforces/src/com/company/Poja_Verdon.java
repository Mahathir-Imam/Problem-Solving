package com.company;

import java.util.Scanner;

public class Poja_Verdon {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();

            }
            int i = 0;
            System.out.println(arr[i+1]);
        }catch (Exception e){
            return;
        }
    }
}
