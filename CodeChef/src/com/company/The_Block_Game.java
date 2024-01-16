package com.company;

import java.util.Scanner;

public class The_Block_Game {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                String str = sc.next();
                String rev_str = new StringBuilder(str).reverse().toString();
                if (rev_str.equals(str)){
                    System.out.println("wins");
                }
                else System.out.println("loses");
            }
        }catch (Exception e){
            return;
        }
    }
}
