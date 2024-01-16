package com.company;

import java.util.Scanner;

public class Mielege_Meter {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                float n = sc.nextInt();
                float x = sc.nextInt();
                float y = sc.nextInt();
                float a = sc.nextInt();
                float b = sc.nextInt();
                float pc = ((n/a)*x);
                float dc = ((n/b)*y);
                if (pc<dc){
                    System.out.println("PETROL");
                }
                else if (pc>dc){
                    System.out.println("DIESEL");
                }
                else System.out.println("ANY");

            }
        }catch (Exception e){
            return;
        }
    }
}
