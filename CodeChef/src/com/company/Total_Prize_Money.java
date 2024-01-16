package com.company;

import java.util.Scanner;

public class Total_Prize_Money {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println((x*10)+(y*90));
            }
        }catch (Exception e){
            return;
        }
    }
}
