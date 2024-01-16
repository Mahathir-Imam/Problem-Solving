package com.company;

import java.util.Scanner;

public class Football_Cup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a==0 && b==0) || (a!=b)){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
