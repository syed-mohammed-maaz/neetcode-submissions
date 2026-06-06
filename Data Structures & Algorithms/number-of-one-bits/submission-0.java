class Solution {
    public int hammingWeight(int n) {
        int count=0;
        StringBuilder s=new StringBuilder();
        while(n!=0){
            String str=String.valueOf(n%2);
            s.append(str);
            n=n/2;
        }
        s.reverse();
     
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
