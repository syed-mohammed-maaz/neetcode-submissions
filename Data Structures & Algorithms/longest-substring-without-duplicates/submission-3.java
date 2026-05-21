class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     int longest=0;
    //     int count=0;
    //     Set<Character> set=new HashSet<>();
    //     for(int i=0;i<s.length();i++){
    //         char c=s.charAt(i);
    //         if(set.contains(c)){
    //             longest=Math.max(longest,count);
                
        
               
    //         }else{
    //             set.add(c);
    //             count++;
    //         }
    //     }
    //     longest=Math.max(longest,count);
    //     return longest;

    // }
    int n=s.length();
    int max=0;
  
    Set<Character> set=new HashSet<>();
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++ ){
            char c=s.charAt(j);
            if(set.contains(c)){
                max=Math.max(set.size(),max);
                set.clear();
                break;
                
            } 
            else {
                set.add(c);
                max=Math.max(set.size(),max);
            }
        }
    }
    return max;


    }
}
