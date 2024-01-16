package com.company;

import java.util.Scanner;

public class JanmanshGames {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if ((x+y) % 2 == 0){
                    System.out.println("Janmansh");
                }
                else
                    System.out.println("Jay");
            }
        }catch (Exception e){
            return;
        }
    }
}
