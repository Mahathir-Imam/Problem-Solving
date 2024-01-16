package com.company;

import java.util.Scanner;

public class Find_Last_And_First_Digits {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(firstDigit(n)+" "+lastDigit(n));
        }catch (Exception e){
        }
    }
    public  static int firstDigit(int n){
        while(n>=10){
            n = n/10;
        }
        return n;
    }
    public static int lastDigit(int n){
        return (n%10);
    }
}
