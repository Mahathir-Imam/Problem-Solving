package com.company;

import java.util.Scanner;

public class Mikes_Sequence {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            if(r >= -45 && r <= 2999){
                System.out.println(r+1);
            }
        }catch (Exception e){
            return;
        }
    }
}
