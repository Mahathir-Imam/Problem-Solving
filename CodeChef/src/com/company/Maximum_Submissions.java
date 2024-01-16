package com.company;

import java.util.Scanner;

public class Maximum_Submissions {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                System.out.println((60*x)/30);
            }
        }catch (Exception e){
            return;
        }
    }
}
