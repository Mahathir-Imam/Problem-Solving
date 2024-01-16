package com.company;

import java.util.Scanner;

public class WhichMixture {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if ((a+b) > 0){
                    if (a>0 && b>0){
                        System.out.println("Solution");
                    }
                    else if(a == 0){
                        System.out.println("Liquid");
                    }
                    else
                        System.out.println("Solid");
                }
            }
        }catch (Exception e)
        {
            return;
        }
    }
}
