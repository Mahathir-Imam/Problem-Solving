package com.company;

import java.util.Scanner;

public class NUM239 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int count=0;
                int fix = 0;
                if (l<=9 && r<=9) {
                    for (int i = l; i <= r; i++) {
                        if (i == 2 || i == 3 || i == 9) {
                            fix++;
                        }
                    }
                    System.out.println(fix);
                }
                if (l<=9 && r>9){
                        for (int i = l; i <= 9; i++) {
                            if (i == 2 || i == 3 || i == 9) {
                                fix++;
                            }
                        }
                        for (int i=10;i<=r;i++){
                            if (i%10==2 || i%10==3 || i%10==9){
                                count++;
                            }
                        }
                    System.out.println(fix+count);
                }
                if (l>=10){
                    for (int i=l; i<=r; i++){
                        if (i%10==2 || i%10==3 || i%10==9){
                            count++;
                        }
                    }
                    System.out.println(count);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
