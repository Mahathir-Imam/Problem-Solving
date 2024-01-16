package com.company;

import java.util.Scanner;

public class BombTheBase {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int n = sc.nextInt();
                int x = sc.nextInt();
                int[] arr = new int[n];
                for (int j=0; j<n; j++)
                {
                   arr[j] = sc.nextInt();
                }
                int count = 0;
                for(int j=0; j<n; j++)
                {
                    if (arr[j]<x){
                        count = j+1;
                    }
                }
                System.out.println(count);

            }
        }catch (Exception e){
            return;
        }
    }
}
