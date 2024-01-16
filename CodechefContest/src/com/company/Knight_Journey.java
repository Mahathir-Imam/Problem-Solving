package com.company;

import java.util.Scanner;

public class Knight_Journey {
    public static void main(String[] args) {
        try {
            Scanner sc =  new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                int dif = (Math.abs(x1-x2))+(Math.abs(y1-y2));
                if (dif%2 == 0){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
