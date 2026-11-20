class Solution {
   List<List<Integer>> result=new ArrayList<>();
   List<Integer> ds=new ArrayList<>();

    void dfs(int[] nums,int i){
        if(nums.length<=i){
            result.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[i]);
        dfs(nums,i+1);

        ds.remove(ds.size()-1);
        dfs(nums,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums,0);
       return result;
    }
}
