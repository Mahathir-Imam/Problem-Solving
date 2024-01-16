package com.company;

import java.util.Scanner;

public class Mario_Bullet {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                int v = y/x;
                if (v<z){
                    System.out.println(z-v);
                }
                else System.out.println(0);
            }
        }catch (Exception e){
            return;
        }
    }
}
