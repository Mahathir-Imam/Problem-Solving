package com.company;

import java.util.Scanner;

public class String_Introduction {
    public static void main(String[] args) {
        try {
           Scanner sc = new Scanner(System.in);
           String str1 = sc.next();
           String str2 = sc.next();
            System.out.println(str1.length()+str2.length());
           if (str1.compareTo(str2)>0){
               System.out.println("Yes");
           }
           else System.out.println("No");
           str1 = (str1.substring(0,1)).toUpperCase()+str1.substring(1);
           str2 = (str2.substring(0,1)).toUpperCase()+str2.substring(1);
            System.out.println(str1+" "+str2);
        }catch (Exception e){
            return;
        }
    }
}
