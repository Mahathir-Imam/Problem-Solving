package com.company;

import java.util.Scanner;

public class Badminton_Serves {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int p = sc.nextInt();
                if (p%2==0){
                    System.out.println((p/2)+1);
                }
                else System.out.println((p+1)/2);
            }
        }catch (Exception e){
            return;
        }
    }
}
