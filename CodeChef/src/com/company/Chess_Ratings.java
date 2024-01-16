package com.company;

import java.util.Scanner;

public class Chess_Ratings {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if ((y-x)%8==0){
                    System.out.println((y-x)/8);
                }
                else System.out.println(((y-x)/8)+1);
            }
        }catch (Exception e){
            return;
        }
    }
}
