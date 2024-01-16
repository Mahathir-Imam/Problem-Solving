package com.company;

import java.util.Scanner;

public class ChefChaat {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if ((x/2) <= y){
                    System.out.println(x/2);
                }
                else if (x > y){
                    System.out.println(y);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
