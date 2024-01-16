package com.company;

import java.util.Scanner;

public class ChessboardDistance {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                int A = Math.abs(x1 - x2);
                int B = Math.abs(y1 - y2);
                System.out.println(Math.max(A, B));
            }
        }catch (Exception e){
            return;
        }
    }
}
