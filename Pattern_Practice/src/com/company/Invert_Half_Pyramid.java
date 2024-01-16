package com.company;

public class Invert_Half_Pyramid {
    public static void main(String[] args) {
        try {
            for (int i=5; i>=1; i--){
                for (int j=i; j>=1; j--){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }catch (Exception e){
            return;
        }
    }
}
