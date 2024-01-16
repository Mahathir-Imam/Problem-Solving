package com.company;

import java.util.Scanner;

public class Chef_And_Brain_Speed {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a<b){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }catch (Exception e){
            return;
        }
    }
}
