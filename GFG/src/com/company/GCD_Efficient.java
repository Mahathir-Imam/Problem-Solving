package com.company;

public class GCD_Efficient {
    static int gcd(int a, int b)
    {
        if (b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a=30, b=5;
        int LCM = (a*b)/gcd(a,b);
        System.out.println("GCD is "+gcd(a,b));
        System.out.println("LCM is "+LCM);
    }
}
