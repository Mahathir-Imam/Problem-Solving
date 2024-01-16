package com.company;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int n = sc.nextInt();
                int x = sc.nextInt();
                int p = sc.nextInt();
                int cal = ((x*3) - ((n - x) * 1));
                if(cal >= p)
                {
                    System.out.println("PASS");
                }
                else
                    System.out.println("FAIL");
            }
        }catch (Exception e){
            return;
        }
    }
}
