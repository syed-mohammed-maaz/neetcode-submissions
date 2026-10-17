class Solution {
    Set<List<Integer>> result=new HashSet<>();
    List<Integer> ds=new ArrayList<>();
    int n;

    void dfs(int i,int[] nums){
        if(i>=n){
            result.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[i]);
        dfs(i+1,nums);

        ds.remove(ds.size()-1);
        dfs(i+1,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        n=nums.length;
        dfs(0,nums);

        return new ArrayList<>(result);
    }
}
