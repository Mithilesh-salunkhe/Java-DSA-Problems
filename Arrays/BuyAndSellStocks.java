public class BuyAndSellStocks {

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i<prices.length ; i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            }else{ //loss
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){ //T.C -->O(n)
        int arr[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(arr));

    }
  
}
