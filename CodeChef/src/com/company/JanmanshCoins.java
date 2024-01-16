package com.company;

import java.util.Scanner;

public class JanmanshCoins {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int tp;
                tp = (x*10)+(y*5);
                System.out.println(tp);
            }
        }catch (Exception e){
            return;
        }
    }
}
