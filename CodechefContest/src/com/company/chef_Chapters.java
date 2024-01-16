package com.company;

import java.util.Scanner;

public class chef_Chapters {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                int tu = x*y;
                int tchap = tu*z;
                System.out.println(tchap);
            }
        }catch (Exception e){
            return;
        }
    }
}
