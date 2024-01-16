package com.company;

import java.util.Scanner;

public class Change_Row_And_Column_Both {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int Sx = sc.nextInt();
                int Sy = sc.nextInt();
                int Ex = sc.nextInt();
                int Ey = sc.nextInt();
                if (Sx != Ex){
                    if (Sy != Ey){
                        System.out.println(1);
                    }
                    else System.out.println(2);
                }
                else {
                    System.out.println(2);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
