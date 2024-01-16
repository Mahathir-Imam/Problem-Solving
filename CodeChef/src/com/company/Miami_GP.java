package com.company;

import java.util.Scanner;

public class Miami_GP {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                float fft = (107*x)/100f;
                if (fft < y){
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
        }catch (Exception e){
            return;
        }
    }
}
