package com.company;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for(int i=0; i<tc; i++){
                int n = sc.nextInt();
                int count = 0;
                String temp = Integer.toString(n);
                int[] arr = new int[temp.length()];
                for(int j=0; j<temp.length(); j++){
                    arr[j] = temp.charAt(j) - '0';
                    if(arr[j] == 4){
                        //int count = 0;
                        count++;
                    }
                }
                System.out.println(count);

            }
        }catch (Exception e){
            return;
        }
    }
}
