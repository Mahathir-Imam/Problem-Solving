package com.company;

import java.util.Scanner;

public class GoodProgram {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int n = sc.nextInt();
                if (n%4 == 0)
                {
                    System.out.println("Good");
                }
                else
                    System.out.println("Not Good");
            }
        }catch (Exception e){
            return;
        }

    }
}
