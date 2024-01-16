package com.company;

import java.util.Scanner;

public class Ali_HelpingPeople {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int x = 0, d = 0;
            if (((s.charAt(0)+s.charAt(1)) % 2 == 0 &&
                    (s.charAt(3)+s.charAt(4)) % 2 == 0 &&
            (s.charAt(4)+s.charAt(5)) % 2 == 0 &&
                    ((s.charAt(7)+s.charAt(8))%2 == 0)
                ) && ((s.charAt(2) != 'A' || s.charAt(2) != 'E' || s.charAt(2) != 'I' || s.charAt(2) != 'O' ||
                    s.charAt(2) != 'U' || s.charAt(2) != 'Y')))
            {
                System.out.println("valid");
            }

            else System.out.println("invalid");

        }catch (Exception e){
            return;
        }
    }
}
