package com.company;

import java.util.Scanner;

public class WaterMixing {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (a==b){
                    System.out.println("YES");
                }
                else if ((a<b && (a+x)>=b)){
                    System.out.println("YES");
                }
                else if (a>b && (a-y)<=b){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
