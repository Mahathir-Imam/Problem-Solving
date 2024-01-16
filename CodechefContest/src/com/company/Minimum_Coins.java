package com.company;

import java.util.Scanner;

public class Minimum_Coins {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int rs = sc.nextInt();
                if (rs<10){
                    System.out.println(rs);
                }
                else{
                    System.out.println(rs%10);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
