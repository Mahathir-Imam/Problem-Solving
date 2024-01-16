package com.company;

import java.util.Scanner;

public class Monopoly_IN_Chefland {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-->0){
                int r1 = sc.nextInt();
                int r2 = sc.nextInt();
                int r3 = sc.nextInt();
                if ((r1+r2)<r3){
                    System.out.println("YES");
                }
                else if ((r1+r3)<r2){
                    System.out.println("YES");
                }
                else if ((r2+r3)<r1){
                    System.out.println("YES");
                }
                else System.out.println("NO");

            }
        }catch (Exception e){
            return;
        }
    }
}
