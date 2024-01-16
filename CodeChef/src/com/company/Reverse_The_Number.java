package com.company;

import java.util.Scanner;

public class Reverse_The_Number {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                String temp = Integer.toString(n);
                String rev = new StringBuilder(temp).reverse().toString();
                System.out.println(Integer.parseInt(rev));
            }
        }catch (Exception ignored){
        }
    }
}
