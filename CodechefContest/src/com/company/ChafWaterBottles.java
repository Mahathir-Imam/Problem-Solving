package com.company;

import java.util.Scanner;

public class ChafWaterBottles {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int k = sc.nextInt();

                if (x > k)
                {
                    System.out.println(0);
                }
                else if(((n*x) > k))
                {
                    System.out.println(k/x);
                }
                else if((n*x) < k)
                {
                    System.out.println(n);
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
