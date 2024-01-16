package com.company;

import java.util.Scanner;

public class Sugarcane_Juice_Business {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                System.out.println(((n*50)-(((n*50*20)/100)+((n*50*20)/100)+((n*50*30)/100))));
            }
        }catch (Exception ignored){
        }
    }
}
