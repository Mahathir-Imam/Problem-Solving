package com.company;

import java.util.Scanner;

public class LuckyNum {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
               int a = sc.nextInt();
               int b = sc.nextInt();
               int c = sc.nextInt();
               if (a==7 || b==7 || c==7){
                   System.out.println("YES");
               }
               else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
