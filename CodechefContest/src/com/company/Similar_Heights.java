package com.company;

import java.util.Scanner;

public class Similar_Heights {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int a=0,b=0;
                int[] arr = new int[n];
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                    if (arr[i] == 1){
                        a=i;
                    }
                    if (arr[i]==n){
                        b=i;
                    }
                    }
                if (a<b){
                    System.out.println(n-1+a-b);
                }
                else System.out.println(a-b+n-2);
            }
        }catch (Exception e){
            return;
        }
    }
}
