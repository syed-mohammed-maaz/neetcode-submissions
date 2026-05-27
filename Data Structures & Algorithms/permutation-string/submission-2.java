class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
       
        


        for(int i=0;i<n-m+1;i++){
            String temp=s2.substring(i,i+m);
            int[] al=new int[26];
            for(int k=0;k<m;k++){
                al[s1.charAt(k)-'a']++;
            }
            for(int k=0;k<m;k++){
                al[temp.charAt(k)-'a']--;
            }
            for(int k=0;k<26;k++){
                if(al[k]!=0) break;
                else if(k==25){
                    return true;
                }
            }
            
            
        }
        return false;
    }
}
