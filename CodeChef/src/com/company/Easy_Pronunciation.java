package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Easy_Pronunciation {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                String str = sc.next();
                int count = 0;
                //String arrStr = Arrays.toString(str.toCharArray());
                for (int i=0; i<n; i++){
                    if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                        count = 0;
                    }
                    else count++;
                    if (count>=4){
                        System.out.println("No");
                        break;
                    }
                }
                if (count<4){
                    System.out.println("Yes");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
