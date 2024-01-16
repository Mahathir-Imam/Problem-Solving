package com.company;

import java.util.Scanner;

public class Nearest_Exit {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x<=50){
                    System.out.println("LEFT");
                }
                else System.out.println("RIGHT");
            }
        }catch (Exception e){

        }
    }
}
