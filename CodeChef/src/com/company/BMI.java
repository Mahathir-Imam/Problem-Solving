package com.company;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int m = sc.nextInt();
                int h = sc.nextInt();
                float bmi = (float) m/(h*h);
                if(bmi <= 18){
                    System.out.println(1);
                }
                else if (bmi>=19 && bmi<=24){
                    System.out.println(2);
                }
                else if (bmi>=25 && bmi<=29){
                    System.out.println(3);
                }
                else
                    System.out.println(4);
            }
        }catch (Exception e){
            return;
        }
    }
}
