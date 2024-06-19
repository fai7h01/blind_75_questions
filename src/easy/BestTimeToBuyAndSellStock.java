package easy;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] stocks = {7,1,5,3,6,4};
        int maxProfit = maxProfit(stocks);
        System.out.println(maxProfit);
    }

    static int maxProfit(int[] prices){

        int buy = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy){
                buy = prices[i];
            }
            if (prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;

    }

}
