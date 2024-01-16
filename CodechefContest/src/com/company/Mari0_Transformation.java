package com.company;

import java.util.Scanner;

public class Mari0_Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int a = sc.nextInt();
            if (a%3 == 0){
                System.out.println("NORMAL");
            }
            else if (a%3 == 1){
                System.out.println("HUGE");
            }
            else System.out.println("SMALL");
        }
    }
}
