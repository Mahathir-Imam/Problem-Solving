package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = input.readLine();
            int num1 = Integer.parseInt(input.readLine());
            float numf = Float.parseFloat(input.readLine());
            double numd = Double.parseDouble(input.readLine());
            char ch = (char) System.in.read();

            System.out.println(name);
            System.out.println(num1);
            System.out.println(numf);
            System.out.println(numd);
            System.out.println(ch);
        }catch (Exception e){

        }
    }
}
