package com.company;

import java.util.Scanner;

public class Mode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a%b);
        }
    }
}
