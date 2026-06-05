class Solution { 
  public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>,List<String>> h=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            //create an array of alphabets which tracks count of each char in string
            int[] arr=new int[26];
            String str=strs[i];
            int m=str.length();
            for(int j=0;j<m;j++){
                int index=str.charAt(j)-'a';
                arr[index]++;
            }

            //store each of array in hasmap
            List<Integer> li=Arrays.stream(arr).boxed().toList();
            h.putIfAbsent(li,new ArrayList<>()); //if key not presernt create empty list
            h.get(li).add(str);//Adding string to the value of key


        }

        //return the values directly without using a matrix
        return new ArrayList<>(h.values()); 

    } 
}
