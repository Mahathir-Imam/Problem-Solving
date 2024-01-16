package com.company;

import java.util.Scanner;

public class Email_Remainders {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int u = sc.nextInt();
            System.out.println(n-u);
        }catch (Exception e){
            return;
        }
    }
}
