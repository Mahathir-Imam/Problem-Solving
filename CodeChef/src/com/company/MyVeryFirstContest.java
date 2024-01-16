package com.company;

import java.util.Scanner;

public class MyVeryFirstContest {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((n-a)+" "+((n-a)-b));
        }catch (Exception e){
            return;
        }
    }
}
