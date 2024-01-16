package com.company;

import java.util.Scanner;

public class Bucket_And_WaterFlow {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int w = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                if (w+(y*z) > x){
                    System.out.println("overflow");
                }
                else if (w+(y*z) < x){
                    System.out.println("unfilled");
                }
                else if (w+(y*z) == x){
                    System.out.println("filled");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
