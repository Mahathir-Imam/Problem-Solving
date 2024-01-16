package com.company;

import java.util.Scanner;

public class SubString_Comparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int n = s.length();
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for (int i=0; i<n-k+1; i++){
            String temp = s.substring(i,i+k);
            largest = largest.compareTo(temp)>0? largest:temp;
            smallest = smallest.compareTo(temp)<0? smallest:temp;
        }
        System.out.println(smallest+"\n"+largest);

    }

}
