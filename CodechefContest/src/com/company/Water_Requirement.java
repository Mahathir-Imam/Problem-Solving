package com.company;

import java.util.Scanner;

public class Water_Requirement {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                System.out.println(n*2);
            }
        }catch (Exception e){
            return;
        }
    }
}
