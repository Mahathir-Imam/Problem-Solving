package com.company;

import java.util.Scanner;

public class Average_Permutation {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int k =sc.nextInt();
                if (k == 3){
                    System.out.println(1+" "+2+" "+3);
                    return ;
                }
                System.out.print(k+" "+(k-2)+" ");
                for (int i=1; i<k-3; i++){
                    System.out.print(i+" ");
                }
                System.out.println(k-3+" "+(k-1));
            }
        }catch (Exception e){
            return;
        }
    }
}
