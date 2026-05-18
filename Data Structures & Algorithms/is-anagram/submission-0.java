class Solution {
    public boolean isAnagram(String s, String t) {
        //Efficient apprach using fixed Array()
        /**
        USE:char-'a' to get the value of any char from 0 to 25 for 'a' is 97 in ASCII
        representing an alphabet in int val
        1.Cretae a fixed int array of 26 size for all alphabts
        2.now iterate the both strings and for s1 increment the count for that char and
         for s2 decrement the count
        3.no see if any char val is not  zero if yes then return fals else retun true
         */

         int n=s.length();
         if(n!=t.length()) return false;

         int[] alpha=new int[26];
         for(int i=0;i<n;i++){
            alpha[s.charAt(i)-'a']++; //to represemt the alphabet in with integer value
            alpha[t.charAt(i)-'a']--;
         }

         //verify if all are 0
         for(int i:alpha){
            if(i!=0) return false;
         }
         return true;
    }
    //  public boolean isAnagram(String s, String t) {
    //     // hashmap apprach
    //     /**
    //     1.Crreate 2 hasmap to store the freuqncy of 2 diff strings
    //     2.now check the edge case where if the length iss not same then return false
    //     3.Now iterate till length and store the string vales in hasmaps
    //     4.While putting key values if an key exiosts then do +1 else set default of 1 uisng getorDefault()
    //     5.Now iertae the string and for each char see if the frequncy (value) in both hashmaps are saem
    //     6.If diff then return false and also handle null(checking key hich is not in hashmap)
    //      */
    //     int n=s.length();

    //     // n!=t.length()?return false;
    //     if(n!=t.length()) return false;

    //     HashMap<Character,Integer> h1=new HashMap<>();
    //     HashMap<Character,Integer> h2=new HashMap<>();

    // //put key value pair
    //     for(int i=0;i<n;i++){
    //         // h1.put(s.charAt(i),h1.getOrDefault((s.charAt(i)+1,1));//TIP:use incremen outside getOrfealt
    //         h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
    //         h2.put(t.charAt(i),h2.getOrDefault(t.charAt(i),0)+1);
    //     }

    // //see if frequncy of both hashmap matches
        

    //    return h1.equals(h2);




    //  }
    // public boolean isAnagram(String s, String t) {
    //     //aortng apprach nlogn
    //     /**
    //     1.Convert both strings to char arrays
    //     2.Now sort the char arrays
    //     3.See if both arrays are equal and return based on that
    //      */

    //      //if both strings are diff len then return false
    //     if(s.length()!=t.length()) return false;
    //     ArrayList<Character> c1=new ArrayList<>();
    //     ArrayList<Character> c2=new ArrayList<>();

    //     //add each char of string in this char array
    //     for(int i=0;i<s.length();i++){
    //         c1.add(s.charAt(i));
    //         c2.add(t.charAt(i));

    //     }

    //     //for collection use Coolection.sort for primitive arrays use Arrays.sort
    //     Collections.sort(c1);
    //     Collections.sort(c2);

    //     //see and return if all characters are equal
    //     for(int i=0;i<t.length();i++){
    //         if(c1.get(i)!=c2.get(i)) return false;
        
    //     }
    //     return true;
    // }
    
}
