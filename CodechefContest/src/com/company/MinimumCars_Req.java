package com.company;

import java.util.Scanner;

public class MinimumCars_Req {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                if ((n%4)>=1){
                    System.out.println((n/4)+1);
                }
                else if (n>1 && n<=4){
                    System.out.println(1);
                }
                else System.out.println(n/4);
            }
        }catch (Exception e){
            return;
        }
    }
}
