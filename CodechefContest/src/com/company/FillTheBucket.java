package com.company;

import java.util.Scanner;

public class FillTheBucket {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int k = sc.nextInt();
                int x = sc.nextInt();
                if(k>x){
                    System.out.println(k-x);
                }

            }
        }catch (Exception e){
            return;
        }

    }
}
