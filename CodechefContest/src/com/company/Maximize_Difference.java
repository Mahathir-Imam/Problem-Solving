package com.company;

import java.util.Scanner;

public class Maximize_Difference {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int ans1=0,ans2=0;
                if (m<(2*n)){
                    System.out.println(m+" "+m);
                }
                else if (m>=(2*n) && (m%n == 0)){
                    System.out.println(m+" "+n);
                }
                else {
                    int x = m/2;
                    if (m>=2*n){
                        x=2*n;
                    }
                    int diff = Integer.MIN_VALUE;
                    for (int i=n; i<=x; i++){
                        int d = m/i;
                        int currdiff = (i*d)-i;
                        if (currdiff>diff){
                            ans1=i;
                            ans2=(i*d);
                            diff=currdiff;
                        }
                    }
                    System.out.println(ans1+" "+ans2);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
