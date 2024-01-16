package com.company;

import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[][] arr = new int[5][5];
            int countMove = 0;
            for (int i=0; i<5; i++){
                for (int j=0; j<5; j++){
                    arr[i][j] = sc.nextInt();
                    if (arr[i][j] == 1){
                        countMove = (Math.abs(2-i))+(Math.abs(2-j));
                    }
                }
            }
            System.out.println(countMove);

        }catch (Exception e){
            return;
        }
    }
}
