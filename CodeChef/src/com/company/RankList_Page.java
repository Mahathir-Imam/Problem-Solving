package com.company;

import java.util.Scanner;

public class RankList_Page {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x%25==0){
                    System.out.println((x/25));
                }
                else System.out.println((x/25)+1);
            }
        }catch (Exception e){
            return;
        }
    }
}
