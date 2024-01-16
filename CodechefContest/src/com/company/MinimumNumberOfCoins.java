package com.company;

import java.util.Scanner;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                if ((x >= 10) && (x%10 == 0))
                {
                    System.out.println(x/10);
                }
                else if (x == 5)
                {
                    System.out.println(1);
                }
                else if ((x>=15) && (x%10 == 5))
                {
                    System.out.println((x-5)/10 + 1);
                }
                else
                    System.out.println(-1);
            }
        }catch (Exception e){
            return;
        }
    }
}
