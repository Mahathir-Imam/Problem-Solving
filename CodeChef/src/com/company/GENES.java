package com.company;

import java.util.Scanner;

public class GENES {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            char f = sc.next().charAt(0);
            char m = sc.next().charAt(0);
           // if (((f=='R') && (m == 'R')) || ((f=='R') && (m == 'G')) || ((f == 'R') && (m == 'B')))
            if ((f == 'R') || (m == 'R'))
            {
                System.out.println('R');
            }
            else if (((f == 'B') && (m == 'B')) || ((f == 'B') && (m == 'G')) || ((f == 'G') && (m == 'B')) )
            {
                System.out.println('B');
            }
            else
                System.out.println('G');


        }catch (Exception e){
            return;
        }
    }
}
