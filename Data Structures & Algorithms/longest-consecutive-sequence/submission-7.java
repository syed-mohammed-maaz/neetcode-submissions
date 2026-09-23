class Solution {
        //Brute force
        //create a set and store the nums
        //now make a list of set and sort it
        //now make a temp list and store diff between each composite nun
        //now count and find largest consecutive 1 series and return it by +1
    public int longestConsecutive(int[] nums) {

        int n=nums.length;
         if(n==0) return 0;
         if(n==1) return 1;

        Set<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        
        int m=set.size();
        List<Integer> temp=new ArrayList<>(set);
        Collections.sort(temp);

        
         if(m==0) return 0;
         if(m==1) return 1;
        int[] temp1=new int[m];
        for(int i=1,j=0;i<m&&j<m;i++){
            int diff=temp.get(i)-temp.get(i-1);
            
            if(diff!=1){
                
                temp1[j++]=diff;
                
            }else
            temp1[j++]=diff;
     
        }
        temp1[m-1]=temp.get(m-1)-temp.get(m-2);

        int result=0;
        int count=0;
         for(int i=0;i<m;i++){
            if(temp1[i]==1) count++;
            else{
                
                result=Math.max(result,count+1);
                count=0;
            }
         }
        return result=Math.max(result,count);
    }
}
