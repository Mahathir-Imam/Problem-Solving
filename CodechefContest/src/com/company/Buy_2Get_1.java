package com.company;

import java.util.Scanner;

public class Buy_2Get_1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int n = sc.nextInt();
                int x = sc.nextInt();
                if (n == 1){
                    System.out.println(x);
                }
                else if (n == 2){
                    System.out.println(n*x);
                }
                else
                    System.out.println((n-(n/3))*x);
            }
        }catch (Exception e){
            return;
        }
    }
}
