package com.company;

import java.util.Scanner;

public class Chef_and_Contest {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int p = sc.nextInt();
                int q = sc.nextInt();
                if ((x+(p*10))<(y+(q*10))){
                    System.out.println("Chef");
                }
                else if ((x+(p*10))>(y+(q*10))){
                    System.out.println("Chefina");
                }
                else System.out.println("Draw");
            }
        }catch (Exception e){
            return;
        }
    }
}
