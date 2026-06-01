class Solution {
    public int findMin(int[] nums) {
       return Arrays.stream(nums).min().getAsInt();
        // return Collections.min(arr);
    }
}
