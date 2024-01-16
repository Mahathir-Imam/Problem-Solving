package com.company;

import java.util.Scanner;

public class Minimum_Number_Of_Pizzas {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = Integer.parseInt(sc.next());
                int k = Integer.parseInt(sc.next());
                if (n==k){
                    System.out.println(1);
                }
                else if (n%2!=0 || k%2!=0){
                    System.out.println(n);
                }
                else {
                    if (n>k){
                        System.out.println(n/2);
                    }
                    else System.out.println(1);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
