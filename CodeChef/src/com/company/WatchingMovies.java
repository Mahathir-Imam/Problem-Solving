package com.company;

import java.util.Scanner;

public class WatchingMovies {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int tt = (x - y) + (y/2);
            System.out.println(tt);
        }catch (Exception e)
        {
            return;
        }
    }
}
