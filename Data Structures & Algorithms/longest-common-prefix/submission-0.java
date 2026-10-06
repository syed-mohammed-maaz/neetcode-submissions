class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];

        StringBuilder sb=new StringBuilder("");
        int min=Math.min(a.length(),b.length());
        for(int i=0;i<min;i++){
            if(a.charAt(i)==b.charAt(i)) sb.append(b.charAt(i));
            else break;
        }

        return sb.toString();

    }
}