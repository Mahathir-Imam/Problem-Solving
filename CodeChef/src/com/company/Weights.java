package com.company;

import java.util.Scanner;

public class Weights {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int w = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                if (w==x || w==y || w==z){
                    System.out.println("YES");
                }
                else if (w==(x+y+z)){
                    System.out.println("YES");
                }
                else if (w==(x+y) || w==(x+z) || w==(y+z)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
