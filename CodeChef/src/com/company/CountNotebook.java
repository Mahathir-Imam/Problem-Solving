package com.company;

import java.util.Scanner;

public class CountNotebook {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int n = sc.nextInt();
                int total;
                total = (n*1000)/100;
                System.out.println(total);
            }
        }catch (Exception e){
            return;
        }
    }
}
