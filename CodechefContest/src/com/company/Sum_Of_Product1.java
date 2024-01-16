package com.company;

import java.util.Scanner;

public class Sum_Of_Product1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long n = sc.nextInt();
                long count=0,ans=0;
                for (int i=0; i<n; i++){
                    long temp = sc.nextInt();
                    if (temp==1){
                        count++;
                    }
                    else {
                        ans = ans + (count*(count+1)/2);
                        count=0;
                    }
                }
                ans = ans + (count*(count+1)/2);
                System.out.println(ans);
            }
        }catch (Exception e){
            return;
        }
    }
}
