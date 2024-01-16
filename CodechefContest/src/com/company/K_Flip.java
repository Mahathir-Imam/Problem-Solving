package com.company;

import java.util.Scanner;

public class K_Flip {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int t=0;
                String str = sc.next();
                //char[] ch = new char[str.length()];
                int[] arr = new int[200001];
                for (int i=0; i<=2*n; i++){
                    arr[i] = 0;
                }
                for (int i=1; i<=n-k+1;i++){
                    if ((str.charAt(i)+t)%2 == 1){
                        t++;
                        arr[i+k-1] = 1;
                    }
                    t -= arr[i];

                    boolean b = str.charAt(i) == 48;
                }
                for (int i=n-k+2; i<=n; i++){
                    boolean b = str.charAt(i) == (char) (48 + (str.charAt(i) + t) % 2);
                    t -= arr[i];
                }
                for (int i=1; i<=n; i++){
                    System.out.println(str.charAt(i));
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
