package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryStringCost2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                String s = sc.next();
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String sortArr = new String(chars);
                if (sortArr.charAt(0) == '1' || sortArr.charAt(n-1) == '0'){
                    System.out.println('0');
                }
                else
                    System.out.println(Math.min(x, y));
            }
        }catch (Exception e){
            return;
        }
    }
}
