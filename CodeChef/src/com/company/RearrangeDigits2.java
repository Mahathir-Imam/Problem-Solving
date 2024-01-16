package com.company;

import java.util.Scanner;

public class RearrangeDigits2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int count=0;
                int d = sc.nextInt();
                String s = sc.next();
                int[] arr = new int[d];
                for (int i=0; i<s.length(); i++){
                    arr[i] = Integer.parseInt(s.charAt(i)+"");
                }
                for (int j : arr) {
                    if (j == 0 || j == 5) {
                        count = 1;
                        break;
                    }
                }
                if (count == 1){
                    System.out.println("Yes");
                }
                else System.out.println("No");
            }
        }catch (Exception e){
            return;
        }
    }
}
