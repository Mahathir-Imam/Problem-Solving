package com.company;

import java.util.Scanner;

public class Tax_In_Chefland {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x>100){
                    System.out.println(x-10);
                }
                else System.out.println(x);
            }
        }catch (Exception e){
            return;
        }
    }
}
