package com.company;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                String temp = sc.next();
                int count=0;
                for (int i=0; i<temp.length(); i++){
                    if ((temp.charAt(i) + temp.charAt(i + 1) + temp.charAt(i + 2)) == (temp.charAt(i + 3) + temp.charAt(i + 4) + temp.charAt(i + 5))) {
                        count = 1;
                        break;
                    }
                }
                if (count==1){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
