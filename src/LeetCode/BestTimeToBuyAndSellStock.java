package LeetCode;

/**
 * @Description:
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit
 * by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * @author: Wei Liang
 * @date: 2022年12月13日 4:50 PM
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int answer = maxProfit(a);
        System.out.println(answer);
    }
    public static int maxProfit(int[] prices) {
        int least = prices[0];
        int profit = 0;
        int most =0;
        for(int i=0;i<prices.length;i++){
            //find least the price so far
            if(least>=prices[i]){
                least=prices[i];
            }
            //find today's price - least price so far
            profit = prices[i]-least;
            //if today's profit is greater than the previous profit, update today's profit to most
            if(most<=profit){
                most=profit;
            }
        }
        return most;
    }
}
