class Solution {
    public int maxProfit(int[] price) {
        int bestbuy=price[0];
        int maxprofit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>bestbuy){
                maxprofit=Math.max(maxprofit,price[i]-bestbuy);
                }
                bestbuy=Math.min(bestbuy,price[i]);
        }
        return maxprofit;  
    }
}