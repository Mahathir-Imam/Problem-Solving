package com.company;

import java.util.Scanner;

public class Game_Of_Piles1 {
    public static void main(String[] args) {
        try {
           Scanner sc = new Scanner(System.in);
           int tc = sc.nextInt();
           while (tc-->0){
               int n = sc.nextInt();
               int[] arr = new int[n];
               int sum = 0;
               int count = 0;
               for (int i=0; i<n; i++){
                   arr[i] = sc.nextInt();
               }
               for (int j=0; j<n; j++){
                   sum = sum + arr[j];
                   if (arr[j] == 1){
                       count++;
                   }
               }
               if(count>0){
                   System.out.println("CHEF");
               }
               else {
                   if (sum%2 == 0){
                       System.out.println("CHEFINA");
                   }
                   else if (sum%2 != 0){
                       System.out.println("CHEF");
                   }
               }
           }
        }catch (Exception e){
            return;
        }
    }
}
