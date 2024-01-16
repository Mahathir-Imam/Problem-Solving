package com.company;

import java.util.Scanner;

public class SelfDefenceTraining {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int tc2 = sc.nextInt();
                int[] arr;
                int c = 0;
                arr = new int[tc2];
                for (int j=0; j<tc2; j++)
                {
                    arr[j] = sc.nextInt();
                    //c = 0;
                    if((arr[j] >= 10) && (arr[j] <= 60))
                    {
                        c += 1;
                    }

                }
                System.out.println(c);


            }
        }catch (Exception e){
            return;
        }
    }
}
