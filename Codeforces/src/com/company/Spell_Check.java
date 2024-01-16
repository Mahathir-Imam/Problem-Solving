package com.company;

import java.util.Scanner;

public class Spell_Check {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0) {
                int n = sc.nextInt();
                String str = sc.next();
                if (n != 5){
                    System.out.println("NO");
                }
                else {
                    int n1=0,n2=0,n3=0,n4=0,n5=0;
                    for (int i=0; i<str.length(); i++){
                        if (str.charAt(i) == 'T'){
                            n1++;
                        }
                        if (str.charAt(i) == 'i'){
                            n2++;
                        }
                        if (str.charAt(i) == 'm'){
                            n3++;
                        }
                        if (str.charAt(i) == 'u'){
                            n4++;
                        }
                        if (str.charAt(i) == 'r'){
                            n5++;
                        }
                    }
                    if (n1==1 && n2==1 && n3==1 && n4==1 && n5==1){
                        System.out.println("YES");
                    }
                    else System.out.println("NO");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
