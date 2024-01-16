package com.company;

import java.util.Scanner;

public class VaccineDates {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                long d = sc.nextInt();
                long l = sc.nextInt();
                long r = sc.nextInt();
                if (d>l && d>r)
                {
                    System.out.println("Too Late");
                }
                else if (d<l && d<r)
                {
                    System.out.println("Too Early");
                }
                else if (d>=l && d<=r)
                {
                    System.out.println("Take second dose now");
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
