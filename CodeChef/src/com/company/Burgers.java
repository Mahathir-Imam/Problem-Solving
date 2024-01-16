package com.company;

import java.util.Scanner;

public class Burgers {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(Math.min(a,b));
            }
        }catch (Exception e){
            return;
        }
    }
}
