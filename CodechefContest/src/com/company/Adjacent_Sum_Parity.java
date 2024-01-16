package com.company;

import java.util.Scanner;

public class Adjacent_Sum_Parity {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();;
                int[] arr = new int[n];
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
                int sum = 0;
                for (int j=0; j<n; j++){
                    sum+=arr[j];
                }
                if (sum%2==0){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
