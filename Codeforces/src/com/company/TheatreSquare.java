package com.company;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextInt();
            long m = sc.nextInt();
            long  a = sc.nextInt();
            if ( (n%a != 0) && (m%a != 0))
            {
                System.out.println(((n/a)+1)*((m/a)+1));
            }
            else if ((n%a != 0) && (m%a == 0)){
                System.out.println(((n/a)+1)*(m/a));
            }
            else if ((n%a == 0) && (m%a != 0)){
                System.out.println((n/a)*((m/a)+1));
            }
            else if ((n%a == 0) && (m%a == 0)){
                System.out.println((n/a)*(m/a));
            }


        }catch (Exception e){

        }
    }
}
