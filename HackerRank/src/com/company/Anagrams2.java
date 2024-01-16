package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int tc = sc.nextInt();
        //while (tc-->0){
            String s1 = sc.next().toLowerCase();
            String s2 = sc.next().toLowerCase();
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String str1 = new String(arr1);
            String str2 = new String(arr2);
            if (str1.equals(str2)){
                System.out.println("Anagrams");
            }
            else System.out.println("Not Anagrams");
        //}
    }
}
