package com.company;

import java.util.Scanner;

public class TheRatingDilemma {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                long s = sc.nextInt();
                int x = 1;
                long y = -x-s;
                System.out.println(y);
            }
        }catch (Exception e) {
            return;
        }
    }
}
