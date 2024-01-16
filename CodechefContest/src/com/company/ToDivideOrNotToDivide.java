package com.company;

import java.util.Scanner;

public class ToDivideOrNotToDivide {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long n = sc.nextLong();
                long x;

                if (a%b==0){
                    System.out.println("-1");
                    continue;
                }
                x=n;
                if (x%a!=0){
                    x = n+a-(x%a);
                }
                while (!(x%a==0 && x%b!=0)){
                    x = x+a;
                }
                System.out.println(x);

                }


        }catch (Exception e){
            return;
        }
    }
}
