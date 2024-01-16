package com.company;

public class Star_Pattern_Half_Pyramid {
    public static void main(String[] args) {
        try {
            for (int i=1; i<=5; i++){
                for (int j=1; j<=i; j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }catch (Exception ignored){

        }
    }
}
