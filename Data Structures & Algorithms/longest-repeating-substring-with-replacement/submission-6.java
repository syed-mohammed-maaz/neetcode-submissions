// class Solution {
//     public int characterReplacement(String s, int k) {
       
//         int n=s.length();
//         int max=Integer.MIN_VALUE;
//         Map<Character,Integer> map=new HashMap<>();
//         int i=0,j=0;

//         for(i=0;i<n;i++){
//             j=0;
//             for(j=i;j<n;j++){
//                 map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
//                 int freq=0;
//                 for(Map.Entry<Character,Integer> entry:map.entrySet()){
//                     freq=Math.max(freq,entry.getValue());
//                 }
//                 if((j+1-i)-(freq)>k){
//                     max=Math.max(max,j-i);
//                       map.clear();
//                       break;
//                 }


//             }
//             if(!map.isEmpty()){
//                  max=Math.max(max,j-i);
//                  map.clear();
//             }
           
//         }

    
    
     

//         return max;

//     }
// }
class Solution {
    public int characterReplacement(String s, int k) {
       
        int n=s.length();
        int max=Integer.MIN_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        int i=0,j=0;

        while(j<n){
           map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
           int count=0;
           for(Map.Entry<Character,Integer> entry:map.entrySet()){
                count=Math.max(count,entry.getValue());
           }

           if((j-i+1)-count>k){
                max=Math.max(max,j-i);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }else{
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                }
                i++;
           }
           j++;
        }
    
        


        return max=Math.max(max,j-i);

    }
}
