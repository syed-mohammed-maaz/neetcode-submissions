class Solution {
    public int removeElement(int[] nums, int val) {
        int uni=0;
        for(int i:nums){
            if(i!=val) nums[uni++]=i;
        }
        return uni;

    }
}