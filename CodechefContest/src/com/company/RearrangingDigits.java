package com.company;

import java.util.Scanner;

public class RearrangingDigits {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            int flag;
            for (int i=0; i<tc; i++){
                int d = sc.nextInt();
                String s = sc.next();
                int n = sc.nextInt();
                String temp = Integer.toString(n);
                int[] arr = new int[d];
                flag = 0;
                for (int j=0; j<d; j++){
                    arr[j] = temp.charAt(j);
                    if (arr[j] == 0 || arr[j] == 5){
                        flag = 1;
                        break;
                    }
                }
                if (flag==1)
                {
                    System.out.println("Yes");
                }
                else System.out.println("No");


            }
        }catch (Exception e){
            return;
        }
    }
}
