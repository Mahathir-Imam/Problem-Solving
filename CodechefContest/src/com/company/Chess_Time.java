package com.company;

import java.util.Scanner;

public class Chess_Time {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                System.out.println((n*60)/20);
            }
        }catch (Exception e){
            return;
        }
    }
}
