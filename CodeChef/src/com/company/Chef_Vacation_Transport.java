package com.company;

import java.util.Scanner;

public class Chef_Vacation_Transport {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                long x = sc.nextInt();
                long y = sc.nextInt();
                long z = sc.nextInt();
                if ((x+y) > z){
                    System.out.println("TRAIN");
                }
                else if ((x+y) < z){
                    System.out.println("PLANEBUS");
                }
                else System.out.println("EQUAL");
            }
        }catch (Exception e){
            return;
        }
    }
}
