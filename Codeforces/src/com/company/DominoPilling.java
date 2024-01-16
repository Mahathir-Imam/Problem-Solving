package com.company;

import java.util.Scanner;

public class DominoPilling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int dp = (m*n)/2;
            System.out.println(dp);
        }catch (Exception e){
            return;
        }
    }
}
