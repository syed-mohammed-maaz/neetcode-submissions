class Solution {
    public int lengthOfLongestSubstring(String s) {
       //create 2 pointers x and y and a set and max
       //now if y val in set calculate set size with max and 
       //->remove x val from set and icrement x till x==y
       //if not then add that in set and do y++

       int x=0,y=0,max=0;
       int n=s.length();
       Set<Character> set=new HashSet<>();
       while(y<n){
        if(set.contains(s.charAt(y))){
            max=Math.max(max,set.size());
            while(x<y&&set.contains(s.charAt(y))){
                set.remove(s.charAt(x));
                x++;
            }
        }else{
            set.add(s.charAt(y));
            y++;
        }
       }
        return max=Math.max(max,set.size());


    }
    // int n=s.length();
    // int max=0;
  
    // Set<Character> set=new HashSet<>();
    // for(int i=0;i<n;i++){
    //     for(int j=i;j<n;j++ ){
    //         char c=s.charAt(j);
    //         if(set.contains(c)){
    //             max=Math.max(set.size(),max);
    //             set.clear();
    //             break;
                
    //         } 
    //         else {
    //             set.add(c);
    //             max=Math.max(set.size(),max);
    //         }
    //     }
    // }
    // return max;


    // }
}
