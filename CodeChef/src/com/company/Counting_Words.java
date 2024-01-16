package com.company;

import java.util.Scanner;

public class Counting_Words {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.println(n*m);
            }
        }catch (Exception e){
            return;
        }
    }
}
