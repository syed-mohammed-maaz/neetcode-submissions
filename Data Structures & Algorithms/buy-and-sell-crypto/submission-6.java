// class Solution {
//     public int maxProfit(int[] prices) {
//         int max=0;
//         int n=prices.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 if(prices[j]>prices[i]){
//                     max=Math.max(max,prices[j]-prices[i]);
//                 }
//             }
//         }
//         return max;
//     }
// }

// class Solution {
//     public int maxProfit(int[] prices) {
//         int max=0;
//         int n=prices.length;
//         int min=prices[0];
//         for(int i=1;i<n;i++){
//             min=Math.min(min,prices[i]);
//             if(prices[i]>min)max=Math.max(prices[i]-min,max);
//         }
//         return max;
//     }
// }

class Solution {
    //Using 2 pointers
    /**
    1.if len is 1 then return 0
    2.set i and j pointers to 2nd and 3rd ele and a max ele
    3.now if val[i] is greater than val[j] then do i=j and j++
    else see find diff between val[j]-val[i]and see if its larger than max and replace and do j++
    4.now else do j++ because if val[i]>
     */
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==1){
            return 0;
        }
        int max=0;
        int i=0;
        int j=1;
        while(j<prices.length){
            if(prices[i]>prices[j]){
                i=j;
                j++;
            }else {
                max=Math.max(prices[j]-prices[i],max);
                j++;
            }
        }
        return max;
    }

}