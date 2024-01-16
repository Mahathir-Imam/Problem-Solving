package com.company;

import java.util.Scanner;

public class averagePermutation {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                long[] a = new long[n];
                long[] b = new long[n];
                if (n == 3){
                    a[0] = 1;
                    a[1] = 2;
                    a[2] = 3;
                }
                else if (n>=4){
                    a[0] = n;
                    a[1] = n-2;
                    a[n-1] = n-1;
                    a[n-2] = n-3;
                    for (int i=2; i<n-2; i++){
                        a[i] = i-1;

                    }
                }
                for (int i=0; i<n; i++){
                    System.out.print(a[i]+" ");

                }
                System.out.println();
            }

        }catch (Exception e){
            return;
        }
    }
}
