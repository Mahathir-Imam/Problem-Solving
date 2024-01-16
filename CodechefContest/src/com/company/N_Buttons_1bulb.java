package com.company;

import java.util.Scanner;

public class N_Buttons_1bulb {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                String s = sc.next();
                String r = sc.next();
                int s1=0,r1=0;
                for (int i=0; i<n; i++){
                    if (s.charAt(i) == '1'){
                        s1++;
                    }
                }
                for (int i=0; i<n; i++){
                    if (r.charAt(i) == '1'){
                        r1++;
                    }
                }
                int diff = Math.abs(s1-r1);
                if (diff%2 == 0){
                    System.out.println("1");
                }
                else System.out.println("0");
            }
        }catch (Exception e){
            return;
        }
    }
}
