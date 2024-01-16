package com.company;

import java.util.Scanner;

public class HelloEquations {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int temp=0;
                for (int i=1; i*i <= n; i++){
                    if (((n-2*i) % (i+2) == 0) && (n != 2*i) ){
                        System.out.println("YES");
                        temp = 1;
                        break;
                    }
                }
                if (temp == 0){
                    System.out.println("NO");
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
