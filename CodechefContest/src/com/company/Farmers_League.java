package com.company;

import java.util.Scanner;

public class Farmers_League {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                System.out.println(((n-1)*3)-((n-2)*3));
            }
        }catch (Exception e){
            return;
        }
    }
}
