package com.company;

import java.util.Scanner;

public class IncreaseIQ {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if ((x+7) > 170){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }catch (Exception e){
            return;
        }
    }
}
