package com.company;

import java.util.Scanner;

public class BlackCells {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println((n*n)/2);
        }catch (Exception e){
            return;
        }
    }
}
