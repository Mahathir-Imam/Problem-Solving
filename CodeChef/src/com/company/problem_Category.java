package com.company;

import java.util.Scanner;

public class problem_Category {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x>=1 && x<100){
                    System.out.println("Easy");
                }
                else if (x>=100 && x<200){
                    System.out.println("Medium");
                }
                else if (x>=200 && x<=300){
                    System.out.println("Hard");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
