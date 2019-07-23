package easy.maxProfit;

public class BestTimeToBuyAndSellStocks2 {

    private static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{}));
        System.out.println(maxProfit(new int[]{7, 1, 5, 4, 6, 1}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5, 9}));
        System.out.println(maxProfit(new int[]{6, 4, 2, 1}));
        System.out.println(maxProfit(new int[]{6, 6, 6, 6}));

    }

}
