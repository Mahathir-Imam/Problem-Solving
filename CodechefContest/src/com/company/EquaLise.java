package com.company;

import java.util.Scanner;

public class EquaLise {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            int mul = 0;
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a == b){
                    System.out.println("YES");
                }
                else {
                    if (a<b) {
                        for (int i=a; ; i=i * 2) {
                            if (i == b) {
                                System.out.println("YES");
                                break;
                            }
                            if (i>b){
                                System.out.println("NO");
                                break;
                            }
                        }
                    }
                    else {
                            for (int i=b; ; i=i*2){
                                if (i==a){
                                    System.out.println("YES");
                                    break;
                                }
                                if (i>a){
                                    System.out.println("NO");
                                    break;
                                }
                            }
                        }

                }


            }
        }catch (Exception e){
            return;
        }
    }
}
