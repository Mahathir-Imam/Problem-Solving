package com.company;

import java.util.Scanner;

public class Hungry_Chefs {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int n = sc.nextInt();
                int r = sc.nextInt();
                if ((r/y)>=n){
                    System.out.println(0+" "+n);
                }
                else if ((r/x)<n){
                    System.out.println("-1");
                }
                else{
                    int pm = (y*n);
                    int nor = (x-y);
                    int m = (r-pm)/nor;

                    if ((r-pm)%nor != 0){
                        m = m+1;
                    }
                    System.out.println(m+" "+(n-m));
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
