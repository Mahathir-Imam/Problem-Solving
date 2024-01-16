package com.company;

import java.util.Scanner;

public class CourseReg {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();
                if((m-k) >= n){
                    System.out.println("Yes");
                }
                else System.out.println("No");
            }
        }catch (Exception e){
            return;
        }
    }
}
