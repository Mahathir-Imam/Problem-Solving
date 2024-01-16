package com.company;

import java.util.Scanner;

public class Pass_The_Exam {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if ((a<10 || b<10 || c<10) || (a+b+c < 100)){
                    System.out.println("FAIL");
                }
                else if ((a>=10 && b>=10 && c>=10) && (a+b+c >=100)){
                    System.out.println("PASS");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
