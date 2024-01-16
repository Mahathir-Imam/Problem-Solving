package com.company;

import java.util.Objects;

public class Final_Value_After_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for (int i=0; i<operations.length; i++){
            if ((operations[i].equals("++X")) || (Objects.equals(operations[i],"++X"))){
                sum = sum+1;
            }
            else sum = sum -1;
        }
        return sum;
    }
}
