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

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         Deque<Integer> st=new ArrayDeque<>();
//         ListNode temp=head;
//         while(temp!=null){
//             st.push(temp.val);
//             temp=temp.next;
//         }

//         temp=head;
//         while(temp!=null){
//             temp.val=st.pop();
//             temp=temp.next;
//         }
//           return head;
//     }
  
// }
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev=null;
       ListNode cur=head;
       ListNode next=null;
       if(cur!=null) next=cur.next;
       while(cur!=null){
        cur.next=prev;
        prev=cur;
        cur=next;
        if(cur!=null)next=cur.next;
       
       }
       return prev;
    }
  
}