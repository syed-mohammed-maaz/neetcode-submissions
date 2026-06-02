class Solution {
    public int missingNumber(int[] nums) {
        //013

       Arrays.sort(nums);
        for(int i=0,j=0;i<nums.length;i++,j++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}
