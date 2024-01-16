package com.company;

import java.util.Scanner;

public class CarOrBus {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x<y)
                {
                    System.out.println("BIKE");
                }
                else if (x>y)
                {
                    System.out.println("CAR");
                }
                else
                    System.out.println("SAME");
            }
        }catch (Exception e){
            return;
        }
    }
}
