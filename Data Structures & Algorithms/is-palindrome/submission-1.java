class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder temp=new StringBuilder(s);
        temp.reverse();
        String copy=temp.toString().toLowerCase();
        int i=0,j=0;

        while(i<s.length()&&j<copy.length()){
            if(!(Character.isLetterOrDigit(s.charAt(i)))){
                i++;
            }else if(!(Character.isLetterOrDigit(copy.charAt(j)))){
                j++;
            }else{
                if(s.charAt(i)!=copy.charAt(j)) return false;
                i++;
                j++;
            }
        }
        return true;
    }
    /**
    Brute Force
    1.Create a hashSet of all alphabets and numbers
    2.now iterate the string and append all alphabtes and numbers ignoring other chars in syringBuilder
    3.now call the checkPaliendrome where set 2 ointers to start and end and see if both have have char
    and incremant and decrement accordinglty
    */
    // public boolean isPalindrome(String s) {
    //     //create a hashset
    //     String temp="abcdefghijklmnopqrstuvwxyz0123456789";
    //     Set<Character> alpha=new HashSet<>();
    //     for(int i=0;i<36;i++){
    //         alpha.add(temp.charAt(i));
    //     }

    //     StringBuilder result=new StringBuilder();
    //     s=s.toLowerCase();

    //     //now create a final string
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         if(alpha.contains(ch)){
    //             result.append(ch);
    //         }
    //     }

    //     return checkPalindrome(result,0,result.length()-1);
    // }

    // boolean checkPalindrome(StringBuilder s,int start,int end){
    //     while(start<end){
    //         if(s.charAt(start)!=s.charAt(end))  return false;
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }
}