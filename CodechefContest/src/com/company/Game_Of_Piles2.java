package com.company;

import java.util.Scanner;

public class Game_Of_Piles2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int[] a = new int[n];
                int b=0,c=0,d=0,e=0,f=0;
                for (int i=0; i<n; i++){
                    a[i] = sc.nextInt();
                    if (a[i] == 1){
                        d++;
                    }
                    else {
                        if(a[i] == 2){
                            c++;
                        }
                        e = e + a[i];
                        f++;
                        if (a[i]%2 != 0){
                            b++;
                        }
                    }
                }
                if (d == 1){
                    if (b%2 == 0){
                        System.out.println("CHEF");
                        continue;
                    }
                    if (c==0){
                        System.out.println("CHEFINA");
                        continue;
                    }
                    e = e-2;
                    f--;
                    if ((e-f)%2 != 0){
                        System.out.println("CHEFINA");
                        continue;
                    }
                    else {
                        System.out.println("CHEF");
                        continue;
                    }
                }
                else if (d>1){
                    if ((e-f)%2 != 0){
                        System.out.println("CHEF");
                        continue;
                    }
                    else {
                        System.out.println("CHEFINA");
                        continue;
                    }
                }
                if (b%2 != 0){
                    System.out.println("CHEF");
                }
                else {
                    System.out.println("CHEFINA");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
