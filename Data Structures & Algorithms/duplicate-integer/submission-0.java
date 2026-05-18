class Solution {
    public boolean hasDuplicate(int[] nums) {
        /**Efficient using hashset
        1.Iterate through the array
        2.if the val is in hashset then return true
        3.else add that value in hashset 
        */

        Set<Integer> yo=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(yo.contains(nums[i])){
                return true;
            }
            yo.add(nums[i]);
        }
        return false;
    }
}