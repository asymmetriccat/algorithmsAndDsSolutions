package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cheapestflightswithinkstops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        final int kInfCost = 1<<30;
        int[] cost = new int[n];
        Arrays.fill(cost, kInfCost);
        cost[src] = 0;

        for (int i = 0; i <= K; ++i) {
            int[] tmp = cost.clone();
            for(int[] p: flights)
                tmp[p[1]] = Math.min(tmp[p[1]], cost[p[0]] + p[2]);
            cost = tmp;
        }

        return cost[dst] >= kInfCost ? -1 : cost[dst];
    }

    public static void main(String args[]){
        Cheapestflightswithinkstops cheapestflightswithinkstops =new Cheapestflightswithinkstops();
        int [][] flights = new int[][]{{0,1,100},{1,2,100},{0,2,500}};
        cheapestflightswithinkstops.findCheapestPrice(3, flights, 0, 2, 1);

    }
}
