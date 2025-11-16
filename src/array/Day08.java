package array;



//Stock Buy and Sell – Max one Transaction Allowed
public class Day08 {


    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
        System.out.println("Maximum profit  is : "+ maximumProfit(arr));
    }

    public static int maximumProfit(int prices[]) {
        // Code here
        int n = prices.length;
        int min = prices[0];
        int profit =0;

        for(int i =0;i<n ; i++){
            //checking for minimum value;
            if(prices[i]<min){min = prices[i];}

            if((prices[i]- min) >profit){
                profit = prices[i] - min;
            }
        }


        return profit;
    }
}
