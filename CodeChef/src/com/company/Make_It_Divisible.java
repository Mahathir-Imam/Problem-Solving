package com.company;

import java.util.Scanner;

public class Make_It_Divisible {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                for (int i=1; i<=n; i++){
                    if (i==1 || i==n){
                        System.out.print("3");
                    }
                    else System.out.print("0");
                }
                System.out.println();
            }
        }catch (Exception e){
            return;
        }
    }
}
