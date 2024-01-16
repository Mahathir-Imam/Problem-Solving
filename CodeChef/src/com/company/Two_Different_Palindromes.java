package com.company;

import java.util.Scanner;

public class Two_Different_Palindromes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if ((a%2==1 && b%2==1) || (a==1 && b==1)){
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
        }catch (Exception e){
            return;
        }
    }
}
