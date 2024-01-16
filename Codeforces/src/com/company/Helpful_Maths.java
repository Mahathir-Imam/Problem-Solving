package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String[] str = sc.next().split("[+]");
            Arrays.sort(str);
            System.out.println(String.join("+",str));

        }catch (Exception e){
            return;
        }
    }
}
