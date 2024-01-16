package com.company;

import java.util.Scanner;

public class Chef_On_Island {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int xr = sc.nextInt();
                int yr = sc.nextInt();
                int d = sc.nextInt();
                if ((d*xr)<=x && (d*yr)<=y){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
