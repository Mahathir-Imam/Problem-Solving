package com.company;

import java.util.Scanner;

public class Candy_Distributed {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                if ((n%m == 0 && n%2 == 0)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
