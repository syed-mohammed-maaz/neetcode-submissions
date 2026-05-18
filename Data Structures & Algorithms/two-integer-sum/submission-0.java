class Solution {
    public int[] twoSum(int[] nums, int target) {
         /**
        TIP:in hashmap to check if key xits use ->h1.containsKey(key_val) and
        to check if any val is present use->h1.containsValue(val);
        WRONG--->dont use h1.contains(key_val)
        Efficient appoach
        1.Create a hasmap and iterate tthrogh the given array
        2.In each iteration define difference value as target-nums[i] to get another val which need
        to complete the target
        3.Now check if diff is in hasmap if yes then return the current i and the value of diff
        4.else put the key and value in hasmap wheere current val is key and index is value
         */
        int diff=Integer.MIN_VALUE;
        HashMap<Integer,Integer> h1=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            diff=target-nums[i];
            if(h1.containsKey(diff)){
                 return new int[]{h1.get(diff),i};
            }else{
                h1.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};


     
    }
}
