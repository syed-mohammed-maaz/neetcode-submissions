// class Solution {
//     /**
//     Brute force n^3
//     */
//     public List<List<Integer>> threeSum(int[] nums){
//         Arrays.sort(nums);
//         int n=nums.length;
//         Set<List<Integer>> ss=new HashSet<>();

//         for(int i=0;i<n-2;i++){
//            int l=i+1;
//            int r=n-1;
//            while(l<r){
//             int sum=nums[i]+nums[l]+nums[r];
//             if(sum==0){
//                 List<Integer> li=new ArrayList<>();
//                 ss.add(Arrays.asList(nums[i],nums[l],nums[r]));
//                 // li.add(nums[i]);
//                 // li.add(nums[l]);
//                 // li.add(nums[r]);
//                 // ss.add(li);
//                 l++;
               
//             }else if(sum>0){
//                 r--;
//             }else{
//                 l++;
//             }
//            }
//         }
        

//         return new ArrayList<>(ss);
//     }
    
// }
class Solution {
    /**
    1sort the array and iterate till n-2
    2.now make left and right ponters
    3.now see if doing sum of these 3 is equal to 0 if yes then store these 3
    4.else if the usm if greater then decrement the right pointer
    5.else iterate till u get a unique call which is from current l
    and increment l
    */
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        int prev=Integer.MIN_VALUE;;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int  r=n-1;
            if(nums[i]==prev){
                continue;
            }
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    prev=nums[i];
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    int temp=l+1;
                    while(nums[temp]==nums[l]&&temp<r){
                        temp++;
                    }
                    l=temp;

                }else if(sum<0){
                    int temp=l+1;
                    while(nums[temp]==nums[l]&&temp<r){
                        temp++;
                    }
                    l=temp;
                }else{
                    int temp=r-1;
                    while(nums[temp]==nums[r]&&temp>l){
                        temp--;
                    }
                    r=temp;
                }

            }
        }
        return result;
    }
    }