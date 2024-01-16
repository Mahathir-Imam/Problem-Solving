package com.company;

import java.util.Scanner;

public class ShoppingChange {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                int change;
                change = 100 - x;
                System.out.println(change);
            }
        }catch(Exception e){
            return;
        }
    }
}
