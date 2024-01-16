package com.company;

import java.util.Scanner;

public class Bull_Or_Bear {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(x<y){
                    System.out.println("PROFIT");
                }
                else if (x>y){
                    System.out.println("LOSS");
                }
                else System.out.println("NEUTRAl");
            }
        }catch (Exception ignored){

        }
    }
}
