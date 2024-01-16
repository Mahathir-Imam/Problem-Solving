package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Petya_Strings {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.next();
            String str2 = sc.next();
            int str = str1.compareToIgnoreCase(str2);
            if (str>0){
                System.out.println("1");
            }
            else if (str<0){
                System.out.println("-1");
            }
            else System.out.println("0");

        }catch (Exception e){
            return;
        }
    }
}
