package com.company;

import java.io.IOException;

public class ReadLineEx1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter some characters ('q' to quit) : ");
        char ch;
        do {
            ch = (char) System.in.read();
            System.out.print(ch);
        }while (ch != 'q');
        System.out.println();
        System.out.print("Program terminated.");
    }
}
