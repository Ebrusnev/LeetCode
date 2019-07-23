package easy.maxProfit;

public class BestTimeToBuyAndSellStocks1 {

    private static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i];
            if (min > temp) {
                min = temp;
                continue;
            }
            if (temp - min > profit) {
                profit = temp - min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3}));
        System.out.println(maxProfit(new int[]{7, 2, 4, 8, 1}));
    }

}
