package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = Integer.parseInt(sc.nextLine());
            while (tc-->0){
                String str = sc.nextLine();
                try {
                    Pattern p = Pattern.compile(str);
                    System.out.println("Valid");
                }catch (PatternSyntaxException e){
                    System.out.println("Invalid");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
