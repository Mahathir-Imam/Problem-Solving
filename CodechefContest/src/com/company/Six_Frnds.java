package com.company;

import java.util.Scanner;

public class Six_Frnds {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(Math.min((x * 3), (y * 2)));
            }
        }catch (Exception e){
            return;
        }
    }
}
