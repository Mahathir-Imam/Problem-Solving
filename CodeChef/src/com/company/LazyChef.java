package com.company;

import java.util.Scanner;

public class LazyChef {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int x = sc.nextInt();
                int m = sc.nextInt();
                int d = sc.nextInt();
                if ((x*m) < (x+d)){
                    System.out.println(x*m);
                }
                else
                    System.out.println(x+d);
            }
        }catch (Exception e){
            return;
        }
    }
}
