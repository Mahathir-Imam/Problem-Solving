package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Spell_Check_HashSet {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                String str = sc.next();
                HashSet<Character>hs = new HashSet<>();
                for (int i=0; i<str.length(); i++){
                    hs.add(str.charAt(i));
                }
                if (hs.contains('T') && hs.contains('i') && hs.contains('m') && hs.contains('u') && hs.contains('r') && n==5){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
