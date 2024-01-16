package com.company;

import java.util.Scanner;

public class DigitSumParities {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int n = sc.nextInt();
                String temp = Integer.toString(n);
                int sum = 0;
                int[] arr = new int[temp.length()];
                for (int j=0; j<temp.length(); j++){
                    arr[j] = temp.charAt(j);
                    sum = sum + arr[j];
                }
                if (sum%2==0){
                    System.out.println("No");
                }
                else {
                    if (sum%2 != 0){
                        sum = sum+1;
                    }
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
