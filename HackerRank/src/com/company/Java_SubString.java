package com.company;

import java.util.Scanner;

public class Java_SubString {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int start = sc.nextInt();
            int end = sc.nextInt();
            str = str.substring(start,end);
            System.out.println(str);
        }catch (Exception e){
            return;
        }
    }
}
