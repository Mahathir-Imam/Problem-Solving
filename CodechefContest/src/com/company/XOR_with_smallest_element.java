package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class XOR_with_smallest_element {
    public static void main(String[] args) {
        try {
           Scanner sc = new Scanner(System.in);
           int tc = sc.nextInt();
           while (tc-->0){
               int n = sc.nextInt();
               int x = sc.nextInt();
               int y = sc.nextInt();
               int[] arr = new int[n];
               for (int i=0; i<n; i++){
                   arr[i] = sc.nextInt();
               }
               PriorityQueue<Integer> pq = new PriorityQueue<>();
               for (int k : arr){
                   pq.add(k);
               }
               while (y>0){
                   int mini = pq.peek();
                   if ((mini^x) > mini){
                       pq.remove();
                       pq.add(mini^x);
                       y--;
                   }
                   else {
                       if ((y&1) == 0){
                           break;
                       }
                       else {
                           pq.remove();
                           pq.add(mini^x);
                           break;
                       }
                   }
               }
               int kill = 0;
               while (!pq.isEmpty()){
                   arr[kill++] = pq.remove();
               }
               for (int j : arr){
                   System.out.print(j+" ");
               }
               System.out.println();
           }
        }catch (Exception e){
            return;
        }
    }
}
