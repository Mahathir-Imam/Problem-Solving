package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Good_Pairs {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int n = sc.nextInt();
                long[] arry = new long[n];
                HashMap<Long, Long> hmp = new HashMap<>();
                for (int i=0; i<n; i++){
                    arry[i] = sc.nextLong();
                    if (hmp.containsKey(arry[i])){
                        long o_frre = hmp.get(arry[i]);
                        long new_free = o_frre+1L;
                        hmp.put(arry[i],new_free);
                    }
                    else {
                        hmp.put(arry[i],1L);
                    }
                }
                long res=0;
                for (Map.Entry<Long,Long> e : hmp.entrySet()){
                    long eee = e.getValue();
                    if (eee>2){
                        while (eee>0){
                            res+=eee-1;
                            eee=eee-1;
                        }
                    }
                    if (e.getValue()==2){
                        res+=1;
                    }
                }
                System.out.println(res);

            }
        }catch (Exception e){
            return;
        }
    }
}
