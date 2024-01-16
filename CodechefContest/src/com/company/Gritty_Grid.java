package com.company;

import java.util.Scanner;

public class Gritty_Grid {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                n += m-2+a;
                a +=b;
                if (n%2 == 1 && a%2 == 0){
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
        }catch (Exception e){
            return;
        }
    }
}
