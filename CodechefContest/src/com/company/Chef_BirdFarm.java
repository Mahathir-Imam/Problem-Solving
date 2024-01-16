package com.company;

import java.util.Scanner;

public class Chef_BirdFarm {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                if ((z%x!=0) && (z%y!=0)){
                    System.out.println("NONE");
                }
                else if ((z%x==0) && (z%y==0)){
                    System.out.println("ANY");
                }
                else if ((z%x==0) && (z%y!=0)){
                    System.out.println("CHICKEN");
                }
                else if ((z%x!=0) && (z%y==0)){
                    System.out.println("DUCK");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
