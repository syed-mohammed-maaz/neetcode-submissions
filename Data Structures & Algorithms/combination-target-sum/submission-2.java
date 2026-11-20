class Solution {
    Set<List<Integer>> result=new HashSet<>();
    List<Integer> ds=new ArrayList<>();


    int sum=0;
    void dfs(int[] nums,int i,int target){
        if(nums.length<=i||sum>=target){
            if(sum==target){
                result.add(new ArrayList<>(ds));
                return;
            }

            return;
        }

        //take
        sum +=nums[i];
        ds.add(nums[i]);
        dfs(nums,i,target);

        //not  take
        sum -=nums[i];
        ds.remove(ds.size()-1);
        dfs(nums,i+1,target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       Arrays.sort(nums);

       dfs(nums,0,target);

       return new ArrayList<>(result);
       
    }

}