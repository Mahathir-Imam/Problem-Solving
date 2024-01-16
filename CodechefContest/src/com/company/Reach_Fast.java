package com.company;

import java.util.Scanner;

public class Reach_Fast {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int k = sc.nextInt();
                int max = Math.max(x,y);
                int min = Math.min(x,y);
                if (((max-min)%k)==0){
                    System.out.println((max-min)/k);
                }
                else System.out.println(((max-min)/k)+1);
            }
        }catch (Exception e){
            return;
        }
    }
}
