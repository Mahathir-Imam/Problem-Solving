package com.company;

import java.util.Scanner;

public class NextGen {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int X = sc.nextInt();
                int Y = sc.nextInt();
                int gn,ch;
                gn = A*B;
                ch = X*Y;
                if (gn<=ch)
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
