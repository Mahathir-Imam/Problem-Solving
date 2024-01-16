package com.company;

import java.util.Scanner;

public class Height_Of_A_Rationals {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Math.max(a,b));
        }catch (Exception e){
            return;
        }
    }
}
