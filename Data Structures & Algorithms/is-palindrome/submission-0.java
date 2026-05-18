class Solution {
    public boolean isPalindrome(String s) {
        //create a hashset
        String temp="abcdefghijklmnopqrstuvwxyz0123456789";
        Set<Character> alpha=new HashSet<>();
        for(int i=0;i<36;i++){
            alpha.add(temp.charAt(i));
        }

        StringBuilder result=new StringBuilder();
        s=s.toLowerCase();

        //now create a final string
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(alpha.contains(ch)){
                result.append(ch);
            }
        }

        return checkPalindrome(result,0,result.length()-1);
    }
    boolean checkPalindrome(StringBuilder s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))  return false;
            start++;
            end--;
        }
        return true;
    }
}