package com.company;

import java.util.Scanner;

public class Vasys_Coins {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > 0){
                    System.out.println(((a)+(2*b)) + 1);
                }
                else if (a == 0){
                    System.out.println(1);
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
