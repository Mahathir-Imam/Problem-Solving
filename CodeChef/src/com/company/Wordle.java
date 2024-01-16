package com.company;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++) {
                String s = sc.next();
                String t = sc.next();
                char[] ch_s = new char[5];
                char[] ch_t = new char[5];
                int j;
                for (j = 0; j < 5; j++) {
                    ch_s[j] = s.charAt(j);
                    ch_t[j] = t.charAt(j);
                    if (ch_s[j] == ch_t[j])
                    {
                        System.out.print("G");
                    }
                    else
                        System.out.print("B");
                }
                System.out.println();

            }
        }catch (Exception e){
            return;
        }
    }
}
