package com.company;

import java.util.Scanner;

public class cheffina {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int tg = n/5;
                System.out.println(n-tg);
            }
        }catch (Exception e){
            return;
        }
    }
}
