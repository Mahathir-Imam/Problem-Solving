package com.company;

import java.util.Scanner;

public class SolveFirstProblem {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+b);
            }
        }catch (Exception e){
            return;
        }
    }
}
