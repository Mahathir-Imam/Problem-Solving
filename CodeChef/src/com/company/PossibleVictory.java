package com.company;

import java.util.Scanner;

public class PossibleVictory {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int o = sc.nextInt();
            int c = sc.nextInt();
            int tbr = (((20 - o) * 6 * 6) + c);
            if (tbr > r)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");

        }catch (Exception e){
            return;
        }
    }
}
