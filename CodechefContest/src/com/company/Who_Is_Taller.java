package com.company;

import java.util.Scanner;

public class Who_Is_Taller {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x>y){
                    System.out.println("A");
                }
                else if (x<y){
                    System.out.println("B");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
