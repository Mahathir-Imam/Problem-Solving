package com.company;

import java.util.Scanner;

public class Test_Score {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int count = 0;
                int j = 0;
                for (int i=0; i<=n; i++) {
                    if (x * i == y) {
                        count++;
                    }
                }
                if (count==1){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
