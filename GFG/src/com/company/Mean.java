package com.company;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        int mean=0;
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            sum = sum + num;
            count++;
        }
        if (count>0){
            mean = sum/count;
            System.out.println("Mean : "+mean);
        }
        else System.out.println("No integers were input..");
    }
}
