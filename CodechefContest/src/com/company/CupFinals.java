package com.company;

import java.util.Scanner;

public class CupFinals {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int d = sc.nextInt();
                int pos = Math.abs(x-y);

                if (pos <= d ){
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
