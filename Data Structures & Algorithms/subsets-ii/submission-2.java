class Solution {
   Set<List<Integer>> result=new HashSet<>();
   List<Integer> ds=new ArrayList<>();

   void dfs(int[] nums,int i){
        if(nums.length<=i){
            List<Integer> temp=new ArrayList<>(ds);
            Collections.sort(temp);
            result.add(new ArrayList<>(temp));
            return;
        }

        ds.add(nums[i]);
        dfs(nums,i+1);

        ds.remove(ds.size()-1);
        dfs(nums,i+1);
   }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        dfs(nums,0);

        return new ArrayList<>(result);
     
    }
}
