package com.company;

import java.util.Scanner;

public class ChefChocolate {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int c = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int need = ((c-x)*y);
                System.out.println(need);
            }
        }catch(Exception e){

        }
    }
}
