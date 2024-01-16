package com.company;

import java.util.Scanner;

public class Sasta_Shark_Tank {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                //System.out.println(Math.max(((a/10)*100),((b/20)*100)));
                if ((a/10)*100 > (b/20)*100){
                    System.out.println("FIRST");
                }
                else if ((a/10)*100 < (b/20)*100){
                    System.out.println("SECOND");
                }
                else System.out.println("ANY");
            }
        }catch (Exception e){
            return;
        }
    }
}
