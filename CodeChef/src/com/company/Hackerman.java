package com.company;

import java.util.Scanner;

public class Hackerman {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum = a+b;
                int flag = 0;
                for(int i=2; i<=Math.sqrt(sum); i++){
                    if (sum%i==0){
                        flag = 1;
                    }
                }
                if (flag == 0){
                    System.out.println("Alice");
                }
                else System.out.println("Bob");
            }
        }catch (Exception e){
            return;
        }
    }
}
