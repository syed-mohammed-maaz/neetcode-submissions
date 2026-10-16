class Solution {
     Set<List<Integer>> result=new HashSet<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       
       
         
        List<Integer> ds=new ArrayList<>();
     
        dfs(0,nums,target,ds,0);
        return new ArrayList<>(result);
        
    }

    public void dfs(int i,int[] nums,int target,List<Integer> ds,int sum){
        if(sum>=target||i>=nums.length){
            if(sum==target)result.add(new ArrayList<>(ds));
            return;
        }

            ds.add(nums[i]);
            sum +=nums[i];
            dfs(i,nums,target,ds,sum);

            sum -=ds.get(ds.size()-1);
            ds.remove(ds.size()-1);
            dfs(i+1,nums,target,ds,sum);
        


    }
}
