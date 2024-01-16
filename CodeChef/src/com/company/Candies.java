package com.company;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                long[] arr = new long[2*n];
                int flag=-1;
                for (int i=0; i<2*n; i++){
                    arr[i] = sc.nextInt();
                }
                for (int i=0; i<(2*n); i++){
                    int count=0;
                    int k= (int) arr[i];
                    for (int j=0; j<2*n; j++){
                        if (arr[j]==k){
                            count++;
                        }
                        if (count>2){
                            flag=0;
                            break;
                        }
                    }
                }
                if (flag==-1){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
