package com.company;

import java.util.Scanner;

public class Is_the_Score_Consistent {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                if ((a<=c) && (b<=d)){
                    System.out.println("POSSIBLE");
                }
                else System.out.println("IMPOSSIBLE");
            }

        }catch (Exception e){
            return;
        }
    }
}
