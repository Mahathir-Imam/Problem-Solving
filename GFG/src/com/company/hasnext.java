package com.company;

import java.util.Scanner;

public class hasnext {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        boolean num = sc.hasNextFloat();
        boolean num1 = sc.hasNextInt();
        boolean num2 = sc.hasNext();
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
    }
}
