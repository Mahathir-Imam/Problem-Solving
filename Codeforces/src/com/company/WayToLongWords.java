package com.company;

import java.util.Scanner;

public class WayToLongWords {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                String st = sc.next();
                if (st.length() > 10){
                    System.out.print(st.charAt(0));
                    System.out.print((st.length()-2));
                    System.out.print((st.charAt(st.length()-1)));
                    System.out.println();
                }

                else
                    System.out.println(st);
            }
        }catch (Exception e){
            return;
        }
    }
}
