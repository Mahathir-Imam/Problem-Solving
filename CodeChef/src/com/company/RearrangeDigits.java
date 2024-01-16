package com.company;

import java.util.Scanner;

public class RearrangeDigits {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0) {
                int d = sc.nextInt();
                String n = sc.next();
                int count = 0;
                for (int i = 0; i<d; i++) {
                    char ch = n.charAt(i);
                    if (ch == '5' || ch == '0') {
                        count = 1;
                        break;
                    }
                }
                if (count == 1){
                    System.out.println("Yes");
                }
                else System.out.println("No");


            }
        }catch (Exception e){
            return;
        }
    }
}
