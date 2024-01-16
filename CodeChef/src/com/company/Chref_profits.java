package com.company;

import java.util.Scanner;

public class Chref_profits {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                System.out.println((x*z)-(x*y));
            }
        }catch (Exception e){
            return;
        }
    }
}
