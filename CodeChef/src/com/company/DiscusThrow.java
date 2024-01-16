package com.company;

import java.util.Scanner;

public class DiscusThrow {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for(int i=0; i<tc; i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if(a >= b  &&  a >= c)
                {
                    System.out.println(a);
                }
                else if (b >= a &&  b >= c)
                {
                    System.out.println(b);
                }
                else
                    System.out.println(c);
            }
        }catch (Exception e){
            return;
        }

    }
}
