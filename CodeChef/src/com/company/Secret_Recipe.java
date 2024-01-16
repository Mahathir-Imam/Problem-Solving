package com.company;
import java.util.Scanner;
public class Secret_Recipe {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x1 = sc.nextInt();
                int x2 = sc.nextInt();
                int x3 = sc.nextInt();
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();
                float t1 = (float) (Math.abs(x1-x3))/v1;
                float t2 = (float) (Math.abs(x2-x3))/v2;
                if (t1<t2){
                    System.out.println("Chef");
                }
                else if (t1>t2){
                    System.out.println("Kefa");
                }
                else System.out.println("Draw");

            }
        }catch (Exception e){
            return;
        }
    }
}
