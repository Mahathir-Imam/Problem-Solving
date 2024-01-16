package com.company;

import java.util.Scanner;

public class HotCold {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-->0){
                int t = sc.nextInt();
                if (t>20){
                    System.out.println("HOT");
                }
                else System.out.println("COLD");
            }
        }catch (Exception e){
            return;
        }
    }
}
