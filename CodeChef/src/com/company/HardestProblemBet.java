package com.company;

import java.util.Scanner;

public class HardestProblemBet {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int Sa = sc.nextInt();
                int Sb = sc.nextInt();
                int Sc = sc.nextInt();
                if ((Sb < Sc) && (Sa > Sb)){
                    System.out.println("Bob");
                }
                else if ((Sb > Sc) && (Sa > Sc)){
                    System.out.println("Alice");
                }
                else
                    System.out.println("Draw");
            }
        }catch (Exception e){
            return;
        }
    }
}
