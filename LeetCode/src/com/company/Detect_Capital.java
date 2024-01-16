package com.company;

public class Detect_Capital {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|[A-Z][a-z]+|[a-z]+");
    }
}
