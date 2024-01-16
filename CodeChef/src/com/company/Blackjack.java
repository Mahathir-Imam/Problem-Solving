package com.company;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for(int i=0; i<tc; i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int wm = 21 - (a+b);
                if(wm <= 10)
                {
                    System.out.println(wm);
                }
                else
                    System.out.println(-1);

            }
        }catch (Exception ignored){

        }
    }
}
