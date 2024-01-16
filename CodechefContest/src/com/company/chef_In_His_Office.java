package com.company;

import java.util.Scanner;

public class chef_In_His_Office {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println((4*x)+y);
            }
        }catch (Exception e){
            return;
        }
    }
}
