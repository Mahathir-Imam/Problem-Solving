package com.company;

import java.util.Scanner;

public class BIT_Plus_Plus {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            int countP=0,countM=0;
            while (tc-->0){
                String str = sc.next();
                if ((str.equals("X++")) || (str.equals("++X"))){
                    countP++;
                }
                else if ((str.equals("X--")) || (str.equals("--X"))){
                    countM--;
                }
            }
            System.out.println((countP+countM));
        }catch (Exception e){
            return;
        }
    }
}
