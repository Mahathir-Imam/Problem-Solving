package com.company;

import java.util.Scanner;

public class CompressTheVideo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                int count = 1;
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
                for(int i=0; i<n-1; i++){
                    if (arr[i] == arr[i+1]){
                        count += 0;
                    }
                    else count +=1;
                }
                System.out.println(count);
            }
        }catch (Exception e){
            return;
        }
    }
}
