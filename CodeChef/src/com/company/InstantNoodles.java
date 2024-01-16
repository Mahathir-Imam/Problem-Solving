package com.company;

import java.util.Scanner;

public class InstantNoodles {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int tc = x*y;
            System.out.println(tc);

        }catch (Exception e){
            return;
        }
    }
}
