package com.company;

import java.util.Scanner;

public class ThePreparations {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                long m = sc.nextInt();
                int n = sc.nextInt();
                int k = sc.nextInt();
                if (((long) n *k) >= m)
                {
                    System.out.println("NO");
                }
                else if (((long) n *k) < m){
                    System.out.println("YES");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
