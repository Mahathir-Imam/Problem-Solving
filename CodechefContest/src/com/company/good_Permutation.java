package com.company;

import java.util.Scanner;

public class good_Permutation {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                if (n%2 == 1){
                    if (n==1 || n==3){
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(3+" "+5+" "+1+" "+2+" "+4);
                        for (int i=n; i>=6; i--){
                            System.out.print(i+" ");
                        }
                        System.out.println();
                    }
                }
                else {
                    for (int i=1; i<=n; i++){
                        System.out.print((n+1)-i+" ");
                    }
                    System.out.println();
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
