class Solution {
    public int[] twoSum(int[] numbers, int target){
        int left=0;
        int right=numbers.length-1;
        int sum=0;
        while(left<right){
            sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[] {-1,-1};
    }
    /*
Brute force
1.run a nested loop to see if u find the target
2.now since we have to reur 1-indexed return i+1 and j+1
    */
    // public int[] twoSum(int[] numbers, int target) {
    //     int n=numbers.length;
    //     for(int i=0;i<n-1;i++){
           
    //         for(int j=i+1;j<n;j++){
                    
    //             if(numbers[i]+numbers[j]==target){
    //                 return new int[]{i+1,j+1};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }
}
