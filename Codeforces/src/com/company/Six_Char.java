package com.company;

import java.util.Scanner;

public class Six_Char {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            if (s.charAt(0) == 's' && s.charAt(1) == 't' && s.charAt(2) == 'r'
                    && s.charAt(3) == 'i' && s.charAt(4) == 'n' && s.charAt(5) == 'g'){
                System.out.println(s);
            }
        }catch (Exception e){
            return;
        }
    }
}
