class Solution {
    Set<List<Integer>> result=new HashSet<>();
    List<Integer> ds=new ArrayList<>();

    void dfs(int[] nums,int i,int target,int sum){
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
        dfs(nums,i,target,sum);

        //not  take
        sum -=nums[i];
        ds.remove(ds.size()-1);
        dfs(nums,i+1,target,sum);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       Arrays.sort(nums);

       dfs(nums,0,target,0);

       return new ArrayList<>(result);
       
    }

}