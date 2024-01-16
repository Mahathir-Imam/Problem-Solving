package com.company;

import java.util.Scanner;

public class ValentineComing {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x<y)
                {
                    System.out.println(0);
                }
                else
                    System.out.println(x/y);
            }
        }catch (Exception e){
            return;
        }
    }
}
