package com.company;

import java.util.Scanner;

public class JanmanshAssign {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                int y;
                y = x + (3);
                if(y <= 10)
                {
                    System.out.println("Yes");
                }
                else
                    System.out.println("No");
            }
        }catch (Exception e){
            return;
        }
    }
}
