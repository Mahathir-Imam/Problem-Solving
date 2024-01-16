package com.company;

import java.util.Scanner;

public class Fill_Bucket {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for(int i=0; i<tc; i++)
            {
                int k = sc.nextInt();
                int x = sc.nextInt();
                int res = 0;
                if (k>x)
                {
                    res = k-x;
                }
                System.out.println(res);
            }
            
        }catch (Exception e){
            return;
        }
    }
}
