package com.company;

import java.util.Scanner;

public class Chef_And_his_APPS {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int s = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                if (s>=(x+y+z)){
                    System.out.println(0);
                }
                else if (s<(x+y+z) && ((x+z)<=s) || ((y+z)<=s)){
                    System.out.println(1);
                }
                else System.out.println(2);
            }
        }catch (Exception e){
            return;
        }
    }
}
