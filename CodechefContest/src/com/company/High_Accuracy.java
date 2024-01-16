package com.company;

import java.util.Scanner;

public class High_Accuracy {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x%3 == 0){
                    System.out.println(0);
                }
                else if (x%3 > 0){
                    System.out.println(Math.abs((3*((x/3)+1))-x));
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
