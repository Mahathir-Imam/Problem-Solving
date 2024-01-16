package com.company;

import java.util.Scanner;

public class Chef_Feedbacks2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                String s = sc.next();
                if (s.contains("010") || s.contains("101")){
                    System.out.println("Good");
                }
                else System.out.println("Bad");
            }
        }catch (Exception e){
            return;
        }
    }
}
