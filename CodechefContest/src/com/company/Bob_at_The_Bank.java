package com.company;

import java.util.Scanner;

public class Bob_at_The_Bank {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int w = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                System.out.println(w+((x*z)-(z*y)));
            }

        }catch (Exception e){
            return;
        }
    }
}
