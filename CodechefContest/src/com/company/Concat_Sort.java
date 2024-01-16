package com.company;

import java.util.Scanner;

public class Concat_Sort {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                long[] arr = new long[n];
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextLong();
                }
                long index=-1,ele=-1;
                for (int i=0; i<n-1; i++){
                    if (arr[i]>arr[i+1]){
                        index = i+1;
                        ele = (int) arr[(int) index];
                        break;
                    }
                }
                if (index==-1 || index==n-1){
                    System.out.println("YES");
                    continue;
                }
                long lmx = 0;
                for (int i=0; i<index; i++){
                    if (arr[i]>ele){
                        lmx = arr[i];
                        break;
                    }
                }
                long rmx = arr[(int) (index-1)];
                int i;
                for (i= (int) (index+1); i<n; i++){
                    if (arr[(int) i]>=rmx){
                        rmx=arr[i];
                    }
                    else if (arr[i]<=lmx && arr[i]>=ele){
                        ele = (int) arr[i];
                    }
                    else {
                        System.out.println("NO");
                        break;
                    }
                }
                if (i==n){
                    System.out.println("YES");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
