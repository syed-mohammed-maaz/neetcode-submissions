class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
       
        
        if(n<m) return false;
        Map<Character,Integer> h1=new HashMap<>();
         Map<Character,Integer> h2=new HashMap<>();
         for(int i=0;i<m;i++){
            char ch=s1.charAt(i);
            char ch2=s2.charAt(i);
            h1.put(ch,h1.getOrDefault(ch,0)+1);
            h2.put(ch2,h2.getOrDefault(ch2,0)+1);
         }


        int x=0,y=m-1;
        while(y<n-1){
            
            if(h1.equals(h2)){
                return true;
            }else{
                if(h2.get(s2.charAt(x))==1){
                    h2.remove(s2.charAt(x));
                    x++;
                    y++;
                    h2.put(s2.charAt(y),h2.getOrDefault(s2.charAt(y),0)+1);
                }else{
                    h2.put(s2.charAt(x),h2.getOrDefault(s2.charAt(x),0)-1);
                    x++;
                    y++;
                    h2.put(s2.charAt(y),h2.getOrDefault(s2.charAt(y),0)+1);
                }
            }
        }
        
 return h1.equals(h2);

        
        // for(int i=0;i<n-m+1;i++){
        //     String temp=s2.substring(i,i+m);
        //     int[] al=new int[26];
        //     for(int k=0;k<m;k++){
        //         al[s1.charAt(k)-'a']++;
        //     }
        //     for(int k=0;k<m;k++){
        //         al[temp.charAt(k)-'a']--;
        //     }
        //     for(int k=0;k<26;k++){
        //         if(al[k]!=0) break;
        //         else if(k==25){
        //             return true;
        //         }
        //     }
            
            
        // }
       
    }
}
