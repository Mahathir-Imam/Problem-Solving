package com.company;

import java.util.Scanner;

public class Chef_Gym {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                if ((x+y)<=z){
                    System.out.println("2");
                }
                else if (x<=z){
                    System.out.println("1");
                }
                else {
                    System.out.println("0");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
