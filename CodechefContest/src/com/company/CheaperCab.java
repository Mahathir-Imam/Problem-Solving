package com.company;

import java.util.Scanner;

public class CheaperCab {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x<y){
                    System.out.println("FIRST");
                }
                else if (x>y){
                    System.out.println("SECOND");
                }
                else {
                    System.out.println("ANY");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
