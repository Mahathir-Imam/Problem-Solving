package com.company;

import java.util.Arrays;

public class Maximum_IceCream_Bars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n=costs.length;
        for (int i = 0; i <n;i++)
            if (coins >= costs[i])
                coins -= costs[i];
            else
                return i;
        return n;
    }
}
