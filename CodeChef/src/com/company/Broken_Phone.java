package com.company;

import java.util.Scanner;

public class Broken_Phone {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x>y){
                    System.out.println("NEW PHONE");
                }
                else if (x<y){
                    System.out.println("REPAIR");
                }
                else System.out.println("ANY");
            }
        }catch (Exception e){
            return;
        }
    }
}
