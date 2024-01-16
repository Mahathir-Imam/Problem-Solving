package com.company;

import java.util.Scanner;

public class Practice_Makes_Us_Perfect {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[4];
            for (int i=0; i<4; i++){
                arr[i] = sc.nextInt();
            }
            int count=0;
            for (int i=0; i<4; i++){
                if (arr[i]>=10){
                    count++;
                }
            }
            System.out.println(count);
        }catch (Exception e){
            return;
        }
    }
}
