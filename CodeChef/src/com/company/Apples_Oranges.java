package com.company;

import java.util.Scanner;

public class Apples_Oranges {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a+b <= x){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }catch (Exception e){
            return;
        }
    }
}
