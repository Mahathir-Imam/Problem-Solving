package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class String_Tokens {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String[] s = {""};
        String str = sc.nextLine();
        String[] arrOfStr = str.trim().split("[ !,?._'@]+");
        if (Arrays.equals(arrOfStr,s)){
            System.out.println("0");
        }
        else {
            System.out.println(arrOfStr.length);
            for (String a : arrOfStr){
                System.out.println(a);
            }
        }
    }
}
