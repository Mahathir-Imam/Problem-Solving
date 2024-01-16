package com.company;

public class Split_String_2 {
    public static void main(String[] args) {
        String str = "word1, word2 word3@word4?word5.word6";
        String[] arrOfStr = str.trim().split("[, ?.@]+");
        for (String a:arrOfStr){
            System.out.println(a);
        }
    }
}
