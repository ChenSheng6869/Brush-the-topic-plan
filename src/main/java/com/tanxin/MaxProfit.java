package com.tanxin;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        //Integer.MAX_VALUE:整型类型的最大值
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices){
            //取最小的买入价格
            cost = Math.min(cost, price);
            //最大获利情况
            profit = Math.max(profit, price-cost);
        }
        return profit;
    }
}
