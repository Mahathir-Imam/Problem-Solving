package com.company;

import java.util.Scanner;

public class CredCoins {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println((x*y)/100);



            }
        }catch (Exception e){
            return;
        }
    }
}
