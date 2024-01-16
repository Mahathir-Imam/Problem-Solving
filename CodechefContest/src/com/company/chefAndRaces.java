package com.company;

import java.util.Scanner;

public class chefAndRaces {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                if ((x!=y) && (x!=b) && (x!=a) && (y!=a) && (a!=b) && (y!=b)){
                    System.out.println(2);
                }
                else if (((x==a && y!=b) || (x==b && y!=a) || (y==a && x!=b) || (y==b && x!=a)) && (x!=y && a!=b)){
                    System.out.println(1);
                }
                else if((((x==a) || (x==b)) && ((y==a) || (y==b))) && ((x!=y && a!=b))) {
                    System.out.println(0);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
