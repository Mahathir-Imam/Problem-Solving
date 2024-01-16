package com.company;

import java.util.Scanner;

public class CreditComplete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i=0; i<tc; i++)
        {
            int s = sc.nextInt();
            if(s>65)
            {
                System.out.println("Overload");
            }
            else if (s<35)
            {
                System.out.println("Underload");
            }
            else
                System.out.println("Normal");
        }

    }


}
