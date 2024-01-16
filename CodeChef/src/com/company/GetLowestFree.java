package com.company;

import java.util.Scanner;

public class GetLowestFree {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if ((a > c) && (b > c)){
                    System.out.println(a+b);
                }
                else if ((a > b) && (c >b)){
                    System.out.println(a+c);
                }
                else if ((b>a) && (c>a)){
                    System.out.println(b+c);
                }
                else if ((a==b) && (b==c)){
                    System.out.println(a+b);
                }
                else if ((a==b) && a<c){
                    System.out.println(a+c);
                }
                else if((a==b) && (a>c)){
                    System.out.println(a+b);
                }
                else if ((b==c) && (a>b)){
                    System.out.println(a+b);
                }
                else if((b==c) && (a<b)){
                    System.out.println(b+c);
                }
                else if ((a==c) && (b>c))
                {
                    System.out.println(a+b);
                }
                else if ((a==c) && (b<a)){
                    System.out.println(a+c);
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
