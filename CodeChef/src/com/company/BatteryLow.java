package com.company;

import java.util.Scanner;

public class BatteryLow {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                if(x <= 15)
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
