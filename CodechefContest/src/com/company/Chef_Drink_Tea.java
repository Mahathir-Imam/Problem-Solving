package com.company;

import java.util.Scanner;

public class Chef_Drink_Tea {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                if (x%y==0){
                    System.out.println((x/y)*z);
                }
                else if (x<y){
                    System.out.println(z);
                }
                else System.out.println(((x/y)+1)*z);
            }
        }catch (Exception e){
            return;
        }
    }
}
