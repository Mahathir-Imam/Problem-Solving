package com.company;

import java.util.Scanner;

public class ProgrammingLanguages {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i=0; i<tc; i++){
                int[] arr = new int[6];
                for (int j=0; j<6; j++){
                    arr[j] = sc.nextInt();
                }

                if (((arr[0] == arr[2]) || (arr[0] == arr[3])) && ((arr[1] == arr[2]) || (arr[1] == arr[3]))){
                    System.out.println(1);
                }
                else if (((arr[0] == arr[4]) || (arr[0] == arr[5])) && ((arr[1] == arr[4]) || (arr[1] == arr[5]))){
                    System.out.println(2);
                }
                else
                    System.out.println(0);

            }
        }catch (Exception e){

        }
    }
}
