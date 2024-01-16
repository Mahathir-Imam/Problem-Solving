package com.company;

import java.util.Scanner;

public class ColdPlay {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int m = sc.nextInt();
                int s = sc.nextInt();
                System.out.println(m/s);
            }
        }catch (Exception e){
            return;
        }
    }
}
