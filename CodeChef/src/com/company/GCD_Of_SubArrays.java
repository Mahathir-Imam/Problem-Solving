package com.company;

import java.util.Scanner;

public class GCD_Of_SubArrays {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            int flag;
            while (tc-->0){
                int a = sc.nextInt();
                int wdec;
                float wflo;
                flag = 0;
                for (int j=1; j*j<=a; j++){
                    int s = a-(j*j);
                    wdec = (int) Math.sqrt(s);
                    wflo = (float) Math.sqrt(s);
                    if (wdec==wflo){
                        System.out.println(j+" "+wdec);
                        flag=1;
                        break;
                    }
                }
                if (flag==0){
                    if (Math.sqrt(a)*Math.sqrt(a) == a){
                        System.out.println(Math.sqrt(a)+" "+0);
                    }
                    else System.out.println(-1);
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
