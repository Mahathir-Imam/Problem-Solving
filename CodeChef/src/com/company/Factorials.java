package com.company;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int fact=1;
                for (int i=1; i<=n; i++){
                    fact = (fact*i);
                }
                System.out.println(fact);
            }
        }catch (Exception e){

        }
    }
}
