package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFOrmatter {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double payment = sc.nextDouble();
            Locale indiaLle = new Locale("en","IN");
            NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat india = NumberFormat.getCurrencyInstance(indiaLle);
            NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            System.out.println("US: "+us.format(payment));
            System.out.println("India: "+india.format(payment));
            System.out.println("China: "+china.format(payment));
            System.out.println("France: "+france.format(payment));

        }catch (Exception e){
            return;
        }
    }
}
