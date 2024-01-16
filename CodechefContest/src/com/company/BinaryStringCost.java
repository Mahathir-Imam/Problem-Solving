package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class BinaryStringCost {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                String str = null;

                char[] ch = new char[n];
                for (int j=0; j<n; n++){
                    assert false;
                    ch[j] = str.charAt(j);
                }
                int os = 0;
                int so = 0;
                for (int j=1; j<n+1; j++){
                    if (Objects.equals(str.substring(j - 1, 1), "01")) {
                        os++;
                    }
                    if (Objects.equals(str.substring(j - 1, 1), "10")){
                        so++;
                    }
                    System.out.println((os*x)+(so*y));
                }




            }
        }catch (Exception e){
            return;
        }
    }
}
