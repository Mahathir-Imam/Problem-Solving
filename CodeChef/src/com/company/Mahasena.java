package com.company;

import java.util.Scanner;

public class Mahasena {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            //int tc = sc.nextInt();
            //while (tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                int count=0;
                int odd = 0;
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
                for (int j=0; j<n; j++){
                    if (arr[j]%2 == 0){
                        count++;
                    }
                    else odd++;
                }
                if (count>odd){
                    System.out.println("READY FOR BATTLE");
                }
                else System.out.println("NOT READY");
           // }
        }catch (Exception e){
            return;
        }
    }
}
