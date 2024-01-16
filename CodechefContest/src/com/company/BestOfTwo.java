package com.company;

import java.util.Scanner;

public class BestOfTwo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(x>=y){
                    System.out.println(x);
                }
                else System.out.println(y);
            }
        }catch (Exception e){
            return;
        }
    }
}
