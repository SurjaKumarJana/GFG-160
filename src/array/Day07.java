package array;
/*
buying stocks with out limit

steps:
1. if current price is greater then previous book the profit
 */
public class Day07 {

    public static void main(String[] args) {
        //sample arr
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("the max profit is :"+ maximumProfit(prices));
    }


    //method to calculate the profit
    public static int maximumProfit(int prices[]) {
        // code here

        int profit =0;
        int n = prices.length;
        for(int i =1 ; i<n ; i++){

            if(prices[i]>prices[i-1]){profit+=(prices[i]-prices[i-1]);}

        }
        return profit;
    }
}
