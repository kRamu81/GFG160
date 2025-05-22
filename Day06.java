class Solution {
    public int maximumProfit(int prices[]) {
    int min_value=Integer.MAX_VALUE;
    int profit=0;
     for(int i=0;i<prices.length;i++){
        if(prices[i]<min_value){
            min_value=prices[i];
        }else if(prices[i] - min_value > profit){
            profit=prices[i] - min_value;
        }
    }
    return profit;

}
}
