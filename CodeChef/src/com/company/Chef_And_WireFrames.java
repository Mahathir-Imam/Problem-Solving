package com.company;

import java.util.Scanner;

public class Chef_And_WireFrames {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int x = sc.nextInt();
                System.out.println(((n*2)+(m*2))*x);
            }
        }catch (Exception e){
            return;
        }
    }
}
