class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+n];
        int j=0;
        for(int i:nums){
            arr[j]=i;
            arr[n+j]=i;
            j++;
        }
        return arr;

    }
}