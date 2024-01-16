package com.company;

import java.util.Scanner;

public class Decrement_Increment {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n%4 == 0){
                System.out.println(n+1);
            }
            else{
                System.out.println(n-1);
            }
        }catch (Exception ignored){
        }
    }
}
