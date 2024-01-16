package com.company;

import java.util.Scanner;

public class Averargr_Numbre {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int v = sc.nextInt();
                int sum = 0;
                int[] arr = new int[n];
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                    sum = sum + arr[i];
                }
                int dk = (v*(n+k)-sum)/k;
                int mk = (v*(n+k)-sum)%k;
                if (dk>0 && mk == 0){
                    System.out.println(dk);
                }
                else System.out.println("-1");
            }
        }catch (Exception e){
            return;
        }
    }
}
