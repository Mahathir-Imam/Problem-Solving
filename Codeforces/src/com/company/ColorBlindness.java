package com.company;

import java.util.Scanner;

public class ColorBlindness {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                String s1 = sc.next();
                String s2 = sc.next();
                int COUNT = 0;
                for (int i=0;i<n; i++){
                    if ((s1.charAt(i) == s2.charAt(i)) || (((s1.charAt(i) == 'G')) && ((s2.charAt(i) == 'B'))) || (((s1.charAt(i)=='B') && (s2.charAt(i)=='G')))){
                        COUNT++;
                    }
                }
                if (COUNT == n){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
