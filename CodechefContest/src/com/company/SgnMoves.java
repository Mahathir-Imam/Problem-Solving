package com.company;

import java.util.Scanner;

public class SgnMoves {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=1; i<=tc; i++){
                int n = sc.nextInt();
                int fr = -n;
                int nfr;
                if (n>0 && i==1) {
                    System.out.println(fr);
                    nfr = fr + n;
                }
                //else if (){

                //}

            }
        }catch (Exception e){
            return;
        }
    }
}
