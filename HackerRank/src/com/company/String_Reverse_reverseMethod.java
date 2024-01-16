package com.company;

import java.util.Scanner;

public class String_Reverse_reverseMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reversed = new StringBuilder(str).reverse().toString();
        if (reversed.equals(str)){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
