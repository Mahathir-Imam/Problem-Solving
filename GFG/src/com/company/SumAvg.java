package com.company;

import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i=0; i<5; i++){
            num[i] = sc.nextInt();
        }
        int sum = 0;
        double avg;
        for (int j : num) {
            sum = sum + j;
        }
        avg = (double)sum/(double)num.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
