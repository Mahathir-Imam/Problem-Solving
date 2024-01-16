package com.company;

import java.util.Scanner;

public class AreYouSafe {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                char[] ch = new char[tc];
                for (int j=0; j<tc; j++){
                    ch[j] = sc.next().charAt(0);
                }
                System.out.println("YES");
            }

        }catch (Exception e){
            return;
        }
    }
}
