package com.company;

import java.util.Scanner;

public class A_Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int c = 0;
        for(int i = 0; i<tc; i++)
        {
            int sum = 0;
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
            sum += p+v+t;
            if (sum > 1)
            {
                c += 1;
            }

        }
        System.out.println(c);


    }
}