package com.company;

import java.util.Scanner;

public class GCD_Of_SubArrays2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long nn = sc.nextLong();
                long kk = sc.nextLong();
                long xx = (nn*(nn+1))/2 ;
                if (kk<xx){
                    System.out.println("-1");

                }
                int sum=0;
                for (int i=0; i<nn-1; i++){
                    sum+=(nn-i);
                }
                xx=kk-sum;
                for (int i=0; i<nn-1; i++){
                    System.out.print(1+" ");
                }
                System.out.println(xx);
            }
        }catch (Exception e){
            return;
        }
    }
}
