package com.company;

import java.util.Scanner;

public class PosNegZeroEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int pos=0,neg=0,odd=0,even=0,zero=0;
        for (int i=0; i< arr.length; i++) {
            //System.out.println("Print the value of arr["+i+"]");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if (arr[i]>0){
                pos++;
            }
            else if (arr[i]<0){
                neg++;
            }
            else
                zero++;
            if (arr[i]%2==0){
                even++;
            }
            else odd++;
        }
        //}
        System.out.println("Positive : "+pos+"\nNegative : "+neg+"\nZero : "+zero+"\nEven : "+even+"\nOdd : "+odd);


    }
}
