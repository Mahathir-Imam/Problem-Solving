package com.company;

import java.util.Scanner;

public class TyreProblem {
    public static void main(String[] args) {
        try{

            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i = 0; i<tc; i++)
            {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int nob,noc,tt;
                nob = 2*n;
                noc = 4*m;
                tt = nob+noc;

                System.out.println(tt);
            }

        }catch (Exception e)
        {
            return;
        }
    }
}
