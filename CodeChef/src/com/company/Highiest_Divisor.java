package com.company;

import java.util.Scanner;

public class Highiest_Divisor {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i=10; i>0; i--){
                if (n%i == 0){
                        System.out.println(i);
                        break;
                    }
            }

        }catch (Exception e){

        }
    }
}
