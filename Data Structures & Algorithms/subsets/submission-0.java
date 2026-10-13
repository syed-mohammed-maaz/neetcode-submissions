class Solution {
    List<List<Integer>> arr=new ArrayList<>();
    List<Integer> ds=new ArrayList<>();
    public void subset(int i,int n,int[] nums,List<Integer> ds){
        if(i>=n){
            arr.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[i]);
        subset(i+1,n,nums,ds);

        ds.remove(ds.size()-1);
        subset(i+1,n,nums,ds);

    }
    public List<List<Integer>> subsets(int[] nums) {
        subset(0,nums.length,nums,ds);

        return arr;
    }
}
