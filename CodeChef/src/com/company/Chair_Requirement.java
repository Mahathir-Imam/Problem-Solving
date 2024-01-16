package com.company;

import java.util.Scanner;

public class Chair_Requirement {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x>y){
                    System.out.println(x-y);
                }
                else System.out.println("0");
            }
        }catch (Exception e){
            return;
        }
    }
}
