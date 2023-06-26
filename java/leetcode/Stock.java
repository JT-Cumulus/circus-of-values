package leetcode;
import java.util.Hashtable;

public class Stock {
    public static void main(String[] args) {
        int[] test = {7,1,5,3,6,4};
        int[] test2 = {3,5,1,6,7,4,5};

        System.out.println(stockProfit(test2));
    }

    public static int stockProfit(int[] prices){
        int profit = 0;
        int current = prices[0];
        for (int i = 1; i < prices.length; i++){
            int value = current - prices[i];
            if (value > profit){
                profit = value;
            } else {
                current = prices[i];
            }
        }
        return profit;
    }
}
