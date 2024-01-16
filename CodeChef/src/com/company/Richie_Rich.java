package com.company;

import java.util.Scanner;

public class Richie_Rich {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int x = sc.nextInt();
                System.out.println((b-a)/x);
            }
        }catch (Exception e){
            return;
        }
    }
}
