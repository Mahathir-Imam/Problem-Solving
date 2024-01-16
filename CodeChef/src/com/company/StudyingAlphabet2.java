package com.company;

import java.util.Scanner;

public class StudyingAlphabet2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String s = sc.next().toLowerCase();
            int n = sc.nextInt();
            while (n-->0){
                String a = sc.next().toLowerCase();
                int count = 0;
                for (int i=0; i<a.length(); i++){
                    for (int j=0; j<s.length(); j++){
                        if (a.charAt(i)==s.charAt(j)){
                            count++;
                        }
                    }
                }
                if (count==a.length()){
                    System.out.println("Yes");
                }
                else System.out.println("No");
            }
        }catch (Exception e){
            return;
        }
    }
}
