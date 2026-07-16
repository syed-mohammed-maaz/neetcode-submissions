class Solution {
    /**
    2 pointer apprach(effiecient)
    1.create 2 pointer left and right
    2.now iterate till left<right
    3.see if adding left and right index val is ==to target 
    4.if not see if sum is lesser if yes then increment left
    5.else decrement right
    6.return 1indexed value by left+1 and right+1
    */
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
