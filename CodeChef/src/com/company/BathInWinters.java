package com.company;

import java.util.Scanner;

public class BathInWinters {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int total = x / (2*y);
                System.out.println(total);
            }
        }catch (Exception e){
            return;
        }
    }
}
