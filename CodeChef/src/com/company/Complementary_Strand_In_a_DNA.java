package com.company;

import java.util.Scanner;

public class Complementary_Strand_In_a_DNA {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                String str = sc.next();
                char[] ch = str.toCharArray();
                for (int i=0; i<n; i++){
                    if (ch[i]=='A'){
                        System.out.print("T");
                    }
                    else if (ch[i] == 'T'){
                        System.out.print("A");
                    }
                    else if (ch[i]=='C'){
                        System.out.print("G");
                    }
                    else if (ch[i]=='G'){
                        System.out.print("C");
                    }
                }
                System.out.println();
            }
        }catch (Exception e){
            return;
        }
    }
}
