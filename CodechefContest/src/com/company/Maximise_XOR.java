package com.company;

import java.util.Scanner;

public class Maximise_XOR {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                String sa,sb;
                sa = sc.next();
                sb = sc.next();
                int zerooo,oneee;
                zerooo = oneee = 0;
                for (int i=0;i<sa.length(); i++){
                    if (sa.charAt(i) == '0'){
                        zerooo++;
                    }
                    else oneee++;
                    if (sb.charAt(i) == '0'){
                        zerooo++;
                    }
                    else oneee++;
                }
                int temp = Math.min(zerooo, oneee);
                String ans = "1".repeat(Math.max(0, temp)) +
                        "0".repeat(Math.max(0, sa.length() - temp));
                System.out.println(ans);
            }
        }catch (Exception e){
            return;
        }
    }
}
