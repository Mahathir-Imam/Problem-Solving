package com.company;

import java.util.Scanner;

public class WA_Test_Cases {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];

                int temp = 120;
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
                String str = sc.next();
                for (int i=0; i<n; i++){
                    if (str.charAt(i)=='0'){
                        temp = Math.min(temp,arr[i]);
                    }
                }
                System.out.println(temp);

            }
        }catch (Exception e){
            return;
        }
    }
}
