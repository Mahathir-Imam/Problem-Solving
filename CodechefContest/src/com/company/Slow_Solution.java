package com.company;

import java.util.Scanner;

public class Slow_Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int maxT = sc.nextInt();
                int maxN = sc.nextInt();
                int sumN = sc.nextInt();
                int x,y,z;
                if ((maxT*maxN)<=sumN){
                    System.out.println(maxN*maxN*maxT);
                }
                else {
                    if (sumN%maxN == 0){
                        x = sumN/maxN;
                        System.out.println(maxN*maxN*x);
                    }
                    else {
                        x = sumN/maxN;
                        y = sumN%maxN;
                        System.out.println(x*maxN*maxN+y*y);
                    }
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
