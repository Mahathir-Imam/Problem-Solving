package com.company;

import java.util.Scanner;

public class SummerHeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i=0; i<tc; i++){
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();
            int total = ((Xa/xa) + (Xb/xb));
            System.out.println(total);
        }
    }
}
