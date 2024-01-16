package com.company;

public class GCD {

    static int gcd(int a, int b)
    {
        if (a==0){
            return b;
        }
        if (b==0)
            return a;
        if (a == b)
            return a;
        if (a>b)
            return gcd(a-b, b);
        else
            return gcd(a,b-a);
    }

    public static void main(String[] args) {
        int a = 98, b = 56;
        System.out.println(gcd(a,b));
    }
}
