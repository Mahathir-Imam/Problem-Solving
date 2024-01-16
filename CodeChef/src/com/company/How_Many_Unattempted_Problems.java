package com.company;

import java.util.Scanner;

public class How_Many_Unattempted_Problems {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x-y);
        }catch (Exception e){
            return;
        }
    }
}
