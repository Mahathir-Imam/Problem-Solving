package com.company;

import java.util.Scanner;

public class Chef_Two_Strings {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                String s1 = sc.next();
                String s2 = sc.next();
                int s1len = s1.length();
                /*char[] char1 = s1.toCharArray();
                char[] char2 = s2.toCharArray();*/
                int max = 0;
                int min = 0;
                for (int i=0; i<s1len; i++) {
                    if (s1.charAt(i) == '?' || s2.charAt(i) == '?') {
                        max = max + 1;
                    } else if (s1.charAt(i) != s2.charAt(i)) {
                        max++;
                        min++;
                    }
                }
                System.out.println(min+" "+max);
            }
        }catch (Exception e){
            return;
        }
    }
}
