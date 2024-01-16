package com.company;

import java.util.Scanner;

public class Make_AP {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                if (n == x){
                    System.out.println(n);
                }
                else if ((n+x)%2==0){
                    System.out.println((n+x)/2);
                }
                else System.out.println(-1);
            }
        }catch (Exception ignored){

        }
    }
}
