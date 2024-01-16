package com.company;

import java.util.HashSet;

public class RemoveDuplicateElement {
    static int removeDuplicates(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for (int k : arr) {
            hs.add(k);
        }
        int n = hs.size();
        int j=0;
        for (int x : hs){
            arr[j++] = x;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {4,4,1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
