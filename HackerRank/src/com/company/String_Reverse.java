package com.company;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev_str = "";
        for (int i=str.length()-1; i>=0; i--){
            rev_str += str.charAt(i);
        }
        if (str.equals(rev_str)){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
