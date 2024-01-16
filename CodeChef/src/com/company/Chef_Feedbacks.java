package com.company;

import java.util.Scanner;

public class Chef_Feedbacks {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                String str = sc.next();
                int count=0;
                for (int i=0; i<str.length()-2; i++){
                    if ((str.charAt(i) == '0' && str.charAt(i+1) == '1' && str.charAt(i+2) == '0')
                         || (str.charAt(i) == '1' && str.charAt(i+1) == '0' && str.charAt(i+2) == '1')){
                        count = 1;

                    }
                }
                if (count == 1){
                    System.out.println("Good");
                }
                else System.out.println("Bad");
            }
        }catch (Exception e){
            return;
        }
    }
}
