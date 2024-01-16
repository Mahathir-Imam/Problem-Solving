package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String s1 = sc.next().toLowerCase();
            String s2 = sc.next().toLowerCase();
            boolean result;
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            result = Arrays.equals(arr1,arr2);
            if (result){
                System.out.println("Anagrams");
            }
            else System.out.println("Not Anagrams");

    }
}
