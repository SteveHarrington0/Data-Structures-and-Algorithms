public class stocks {
    public static int buy_sell_stocks(int prices[]){
        int buy = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++){
            if(buy < prices[i])
            {
                int profit = prices[i] - buy;
                max_profit = max_profit < profit ? profit : max_profit;
            }
            else{
                buy = prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        int result = buy_sell_stocks(prices);
        System.out.println("The maximum profit will be " + result);
        
    }
}
