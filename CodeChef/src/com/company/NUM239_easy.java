package com.company;

import java.util.Scanner;

public class NUM239_easy {
    public static void main(String[] args) {
        try {
           Scanner sc = new Scanner(System.in);
           int tc = sc.nextInt();
           while(tc-->0){
               int l = sc.nextInt();
               int r = sc.nextInt();
               int count=0;
               for (int i=l; i<=r; i++){
                   if (i%10==2 || i%10==3 || i%10==9){
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
