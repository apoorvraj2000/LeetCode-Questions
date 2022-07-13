package AllCodes;

public class Best_Time_to_Buy_and_Sell_Stock_II {
	public int maxProfit(int[] prices) {
        int profit=0;
        
        for(int i=1;i<prices.length;i++){
            // Checking if current day price is more than previous day price
            // If yes, then we buy on previous day and sell on current day.
            // Add all such profits to get the total profit
            if(prices[i]>prices[i-1]){
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}
