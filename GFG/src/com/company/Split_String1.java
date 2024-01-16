package com.company;

import java.util.Scanner;

public class Split_String1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                String str = sc.next();
                String[] str_a = str.split("@");
                for (String a: str_a){
                    System.out.println(a);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
