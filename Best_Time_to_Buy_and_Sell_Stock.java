package AllCodes;

public class Best_Time_to_Buy_and_Sell_Stock {

	public int maxProfit(int[] prices) {
        int maxProfit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
           if(prices[i]<min){
               min=prices[i];
           }else{
               maxProfit=Math.max(maxProfit,prices[i]-min);
           }
        }
        return maxProfit;
    }
}
