package com.company;

import java.util.Scanner;

public class GoodWeather {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            //int sum = 0;
            for (int i=0; i<tc; i++) {
                int[] arr = new int[7];
                for (int j = 0; j < 7; j++) {
                    arr[j] = sc.nextInt();
                }
                int sum = 0;
                for (int j=0; j<7; j++)
                {
                    if (arr[j] == 1){
                        sum = sum + 1;
                    }
                }
                if (sum >= 4)
                {
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");

            }
        }catch (Exception e)
        {
            return;
        }
    }
}
