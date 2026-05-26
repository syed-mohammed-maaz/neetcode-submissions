class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        
        char[] c1=new char[m];
       
        c1=s1.toCharArray();
    
        Arrays.sort(c1);
      

        String sb1=new String(c1);
        


        for(int i=0;i<n-m+1;i++){
            String temp=s2.substring(i,i+m);
            char[] c2=new char[m];
            c2=temp.toCharArray();
            Arrays.sort(c2);
            String sb2=new String(c2);
            if(sb1.equals(sb2)) return true;
        }
        return false;
    }
}
