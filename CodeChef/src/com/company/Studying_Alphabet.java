package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Studying_Alphabet {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            //int tc = sc.nextInt();
           // while (tc-->0){
                String str = sc.next().toLowerCase();
                int strlen = str.length();
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                int n = sc.nextInt();
                for (int i=0; i<n; i++){
                    String s = sc.next().toLowerCase();
                    int slen = s.length();
                    char[] chars1 = s.toCharArray();
                    Arrays.sort(chars1);
                    String sorted1 = new String(chars1);
                    if (sorted.equals(sorted1) && strlen==slen){
                        System.out.println("Yes");
                    }
                    else
                        System.out.println("No");

                }
           // }
        }catch (Exception e){
            return;
        }
    }
}
