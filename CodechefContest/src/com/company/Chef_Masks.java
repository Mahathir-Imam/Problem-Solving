package com.company;

import java.util.Scanner;

public class Chef_Masks {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if ((x*100)<(y*10)){
                    System.out.println("Disposable");
                }
                else if ((x*100)>=(y*10)){
                    System.out.println("Cloth");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
