package com.company;

import java.util.Scanner;

public class Reach_On_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0){
            int x = sc.nextInt();
            if (x>=30){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
