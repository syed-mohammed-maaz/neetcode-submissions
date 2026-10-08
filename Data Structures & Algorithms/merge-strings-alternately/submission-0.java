class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        StringBuilder sb=new StringBuilder();

        int min=Math.min(m,n);
        int i=0,j=0;
        while(i<min&&j<min){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        if(m>min) sb.append(word1.substring(i,m));
        if(n>min) sb.append(word2.substring(j,n));

        return sb.toString();

    }
}