package com.company;

import java.util.Scanner;

public class Find_the_direction {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x%4==0) System.out.println("North");
                else if (x%4==1) System.out.println("East");
                else if (x%4==2) System.out.println("South");
                else if (x%4==3) System.out.println("West");
            }
        }catch (Exception e){
            return;
        }
    }
}
