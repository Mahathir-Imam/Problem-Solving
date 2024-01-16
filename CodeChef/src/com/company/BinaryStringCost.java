package com.company;

import java.util.Scanner;

public class BinaryStringCost {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int a=0,b=0;
                String s = sc.next();
                for (int j=0; j<n; j++){
                    if (s.charAt(j) == '0'){
                        a++;
                    }
                    else {
                        b++;
                    }
                }
                if (a == n || b == n){
                    System.out.println('0');
                }
                else {
                    if (x<y){
                        System.out.println(x);
                    }
                    else
                        System.out.println(y);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
