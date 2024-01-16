package com.company;

import java.util.Scanner;

public class FindingShoes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int n = sc.nextInt();
                int m = sc.nextInt();
                if (n<=m)
                    System.out.println(n);
                else System.out.println((n*2)-m);

            }
        }catch (Exception e){
            return;
        }
    }
}
