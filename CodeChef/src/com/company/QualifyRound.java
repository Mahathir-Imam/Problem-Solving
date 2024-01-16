package com.company;

import java.util.Scanner;

public class QualifyRound {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for(int i=0; i<tc; i++)
            {
                int x = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int cs = (a*1) + (b*2);
                if (x <= cs)
                {
                    System.out.println("Qualify");
                }
                else
                    System.out.println("NotQualify");
            }
        }catch (Exception e){
            return;
        }
    }
}
