package com.company;

import java.util.Scanner;

public class Guess_the_Bottom_Face {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x<=6){
                    System.out.println(7-x);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
