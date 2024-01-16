package com.company;
import java.util.Scanner;
public class Triple {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                int count = 0;
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                    for (int k=0; k<n-1; k++){
                        for (int j=1; j<n; j++){
                            if (arr[k] == arr[j]){
                                count++;
                            }
                        }
                    }
                    if (count>=3){
                        System.out.println(arr[i]);
                    }
                    else System.out.println(-1);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
