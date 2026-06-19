/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    //brute force
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
          if(n==0) return null;
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            ListNode l1=lists[i];
          

            while(l1!=null){
                        arr.add(l1.val);
                        l1=l1.next;
                }
        }
           

        
        Collections.sort(arr);
        if(arr.size()==0) return new ListNode();
        
        ListNode dummy=new ListNode(0);

        ListNode temp=dummy;
        for(int i=0;i<arr.size();i++){
            ListNode newNode=new ListNode(arr.get(i));
            temp.next=newNode;
            temp=temp.next;
        }

        return dummy.next;
    }
}
