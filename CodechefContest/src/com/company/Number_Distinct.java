package com.company;


public class Number_Distinct {
    public static void main(String[] args) {
        try {

        }catch (Exception e){
            return;
        }
    }

    private static final int MOD = 1000000007;

     int power(int a, int n, int MOD){
        int p=1;
        while (true){
            if (n%2 == 1){
                p=p*a%MOD;
            }
            a=a*a%MOD;
            n/=2;
        }
     }


}
