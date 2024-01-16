package com.company;

import java.util.Scanner;

public class Non_Adjacent_Flips {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                String s = sc.next();
                int no_zero=0;
                int no_one = 0;
                for (int k=0; k<n; k++){
                    if (s.charAt(k) == '0'){
                        no_zero++;
                    }
                }
                if (no_zero == n){
                    System.out.println("0");
                }
                else {
                    int consone = 0;
                    for (int i=0,j=1; i<n-1; i++,j++){
                        if (s.charAt(i) == '1' && s.charAt(j) == '1') {
                            consone = 1;
                            break;
                        }

                    }
                    if (consone==0) {
                        System.out.println("1");
                    }
                    else System.out.println("2");
                }




            }
        }catch (Exception e){
            return;
        }
    }
}
