package com.company;

import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                System.out.println(10*x);
            }
        }catch (Exception e){
            return;
        }
    }
}
