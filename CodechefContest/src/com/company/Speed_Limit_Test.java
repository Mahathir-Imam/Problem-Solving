package com.company;

import java.util.Scanner;

public class Speed_Limit_Test {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                float aa = sc.nextInt();
                float xx = sc.nextInt();
                float bb = sc.nextInt();
                float yy = sc.nextInt();
                float alc = aa/xx;
                float boob = bb/yy;
                if (alc>boob){
                    System.out.println("Alice");
                }
                else if (alc<boob){
                    System.out.println("Bob");
                }
                else System.out.println("Equal");
            }
        }catch (Exception e){
            return;
        }
    }
}
