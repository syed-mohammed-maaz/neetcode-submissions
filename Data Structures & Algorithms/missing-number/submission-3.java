class Solution {
    //efficient
     public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalSum=(n*(n+1))/2;
        int sum=0;
        for(int i:nums){
            sum +=i;
        }
        return totalSum-sum;
     } 
    //sorting approach
    // public int missingNumber(int[] nums) {
 
    //    Arrays.sort(nums);
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]!=i){
    //             return i;
    //         }
    //     }
    //     return nums.length;
    // }
}
