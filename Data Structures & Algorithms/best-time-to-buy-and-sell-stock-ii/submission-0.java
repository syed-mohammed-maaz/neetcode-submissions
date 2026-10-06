class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int i=0,j=1;

        int total=0;
        int max=0;

        while(j<n){
            if(prices[i]>=prices[j]) {
                i++;
                j++;
            }else{
                total +=prices[j]-prices[i];
                i++;
                j++;
            }
            
        }

        return total;
        
    }
}