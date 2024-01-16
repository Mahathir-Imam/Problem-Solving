package com.company;

import java.util.Scanner;

public class PolyBags {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for(int i=0; i<tc; i++)
            {
                int n = sc.nextInt();
                if (n % 10 == 0)
                {
                    System.out.println(n/10);
                }
                else
                    System.out.println(n/10 + 1);
            }
        }catch (Exception e){
            return;
        }
    }
}
