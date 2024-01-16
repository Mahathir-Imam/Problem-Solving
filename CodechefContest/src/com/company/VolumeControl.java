package com.company;

import java.util.Scanner;

public class VolumeControl {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int mnop = Math.abs(x-y);
                System.out.println(mnop);
            }
        }catch (Exception e){
            return;
        }
    }
}
