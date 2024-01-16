package com.company;

import java.util.Scanner;

public class Zero_Ones_Equal_10 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-->0){
                int n = sc.nextInt();
                if (n%2 == 0){
                    System.out.print("1");
                    for (int i=1; i<n-1; i++){
                        System.out.print("0");
                    }
                    System.out.println("1");
                }
                else {
                    for (int j=0; j<n; j++){
                        if (j==n/2){
                            System.out.print("1");
                            continue;
                        }
                        System.out.print("0");
                    }
                    System.out.println();
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
