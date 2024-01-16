package com.company;

import java.util.Scanner;

public class Court_Distence {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();

                if ((x+y)%2 == 0){
                    System.out.println(Math.max(Math.abs((x+y)/2-x),Math.abs((x+y)/2-y)));
                }
                else if ((x+y)%2 != 0){
                    System.out.println(Math.max(Math.abs(((x+y)/2+1)-x),Math.abs(((x+y)/2+1)-y)));
                }
            }
        }catch (Exception e){
            return;
        }

    }
}
