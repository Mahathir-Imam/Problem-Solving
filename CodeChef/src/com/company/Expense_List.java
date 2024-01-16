package com.company;

import java.util.Scanner;

public class Expense_List {
    public static void main(String[] args) {
        try {
           Scanner sc = new Scanner(System.in);
           int tc = sc.nextInt();
           while (tc-->0){
               int n = sc.nextInt();
               int x = sc.nextInt();
               int rem= (int) Math.pow(2,x);
               for (int i=1; i<=n; i++){
                   rem = rem/2;
               }
               System.out.println(rem);
           }
        }catch (Exception e){
            return;
        }
    }
}
