package com.company;

import java.util.Scanner;

public class Best_Coupons {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                System.out.println(Math.max((x/10),100));
            }
        }catch (Exception e){
            return;
        }
    }
}
