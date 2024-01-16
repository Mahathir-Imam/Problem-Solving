package com.company;

import java.util.Scanner;

public class GroupAssignment {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                long n = sc.nextInt();
                long x = sc.nextInt();
                long cfg = ((2*n) + 1) - x;
                System.out.println(cfg);
            }
        }catch (Exception e){
            return;
        }
    }
}
