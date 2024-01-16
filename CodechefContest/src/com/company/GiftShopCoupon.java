package com.company;

import java.util.Scanner;

public class GiftShopCoupon {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int n = sc.nextInt();;
                int k = sc.nextInt();
                int[] arr = new int[n];
                int sum = 0;
                for (int j=0; j<n; j++)
                {
                    arr[j] = sc.nextInt();
                    sum = sum + arr[j];
                    if (sum < k)
                    {
                        System.out.println(n);
                    }
                    else if (((arr[j]*n)/2) < k)
                    {
                        System.out.println(n);
                    }
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
