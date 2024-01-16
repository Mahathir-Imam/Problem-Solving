package com.company;

import java.util.Scanner;

public class BalancedReversals {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for(int i=0; i<tc; i++)
            {
                int n = sc.nextInt();
                for(int j = 0; j<n; j++)
                {
                    //String str = sc.nextLine();
                    int num = sc.nextInt();
                    String temp = Integer.toString(num);
                    int[] arr = new int[temp.length()];
                    for (int k=0; k<n; k++)
                    {
                        arr[k] = temp.charAt(k) - '0';
                        if (arr[0] == 0)
                        {

                        }
                    }

                }

            }
        }catch (Exception e){
            return;
        }
    }
}
