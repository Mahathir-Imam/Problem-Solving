package com.company;

import java.util.Scanner;

//optimal Solution For to find Second Smallest and largest Number in an Array

public class SecSmall_LargeElementOptimal {
    static public int SecondSmallest(int[] arr, int n)
    {
        int small = Integer.MAX_VALUE;
        int Second_Small = Integer.MAX_VALUE;
        if (n<2){
            return -1;
        }
        for (int i=0; i<n; i++){
            if (arr[i] < small){
                Second_Small=small;
                small=arr[i];
            }
            else if(arr[i] < Second_Small && arr[i] != small){
                Second_Small = arr[i];
            }
        }
        return Second_Small;
    }
    static public int SecondLargest(int[] arr, int n)
    {
        int largest = Integer.MIN_VALUE;
        int Second_largest = Integer.MIN_VALUE;
        if (n<2){
            return -1;
        }
        for (int i=0; i<n; i++){
            if (arr[i]>largest){
                Second_largest=largest;
                largest=arr[i];
            }
            else if (arr[i]<Second_largest && arr[i] != largest){
                Second_largest=arr[i];
            }
        }
        return Second_largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int SSmallest = SecondSmallest(arr, n);
        int SLargest = SecondLargest(arr, n);

        System.out.println("Second Smallest Number is "+SSmallest);
        System.out.println("Second Largest Number is "+SLargest);
    }


}
