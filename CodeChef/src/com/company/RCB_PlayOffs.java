package com.company;

import java.util.Scanner;

public class RCB_PlayOffs {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                if (((2*z)+x) >= y){
                    System.out.println("Yes");
                }
                else
                    System.out.println("No");
            }
        }catch (Exception e){
            return;
        }
    }
}
