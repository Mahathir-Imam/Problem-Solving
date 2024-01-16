package com.company;

import java.util.Scanner;

public class CredScore {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x >= 750){
                System.out.println("YES");
            }
            else
                System.out.println("NO");

        }catch (Exception e){
            return;
        }
    }
}
