package com.company;

import java.util.Scanner;

public class Cars_And_Bikes {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++)
            {
                int n = sc.nextInt();
                if ((n%4 == 0) && (n >= 4)){
                    System.out.println("NO");
                }
                else if (n%4 == 2){
                    System.out.println("YES");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
