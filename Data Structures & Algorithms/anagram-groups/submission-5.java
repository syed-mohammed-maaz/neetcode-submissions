// class Solution { 
//   public List<List<String>> groupAnagrams(String[] strs) {
//         Map<List<Integer>,List<String>> h=new HashMap<>();
//         int n=strs.length;
//         for(int i=0;i<n;i++){
//             //create an array of alphabets which tracks count of each char in string
//             int[] arr=new int[26];
//             String str=strs[i];
//             int m=str.length();
//             for(int j=0;j<m;j++){
//                 int index=str.charAt(j)-'a';
//                 arr[index]++;
//             }

//             //store each of array in hasmap
//             List<Integer> li=Arrays.stream(arr).boxed().toList();
//             h.putIfAbsent(li,new ArrayList<>()); //if key not presernt create empty list
//             h.get(li).add(str);//Adding string to the value of key


//         }

//         //return the values directly without using a matrix
//         return new ArrayList<>(h.values()); 

//     } 
// }
class Solution { 
  public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>,List<String>> h1=new HashMap<>();
        for(String i:strs){
            Map<Character,Integer> h2=new HashMap<>();
            for(int j=0;j<i.length();j++){
                h2.put(i.charAt(j),h2.getOrDefault(i.charAt(j),0)+1);

            }
            List<String> li=new ArrayList<>();
            li=h1.getOrDefault(h2,li);
            li.add(i);
            h1.put(h2,li);
            
        }
        return new ArrayList<>(h1.values());
    }
  }