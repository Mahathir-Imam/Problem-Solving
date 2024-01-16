package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Distinct_Number {
    public static void main(String[] args) throws java.lang.Exception {

            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = 0;
                long x = 0;

                HashSet<Integer> set = new HashSet<>();
                for (int j=0; j<b; j++){
                    for (c=1; c<=a;c++){
                        if (a%c == 0){
                            x = c*a;
                            set.add((int) x);
                        }
                    }
                    a=x;
                }
                Iterator<Integer>m = set.iterator();
                int sum = 0;
                while (m.hasNext()){
                    sum = sum+m.next();
                }
                System.out.println(sum);
            }

    }
}
