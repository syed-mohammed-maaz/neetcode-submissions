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
//     //iterate the head till last
//     //store each node in set and before sroring check if exists 
//     //if yes then return true 
//     public boolean hasCycle(ListNode head) {
//         ListNode temp=head;
        
//         Set<ListNode> set=new HashSet<>();
//         while(temp!=null){
//             if(set.contains(temp)) return true;
//             set.add(temp);
//             temp=temp.next;
//         }
//         return false;
//     }
// }

class Solution {
    //iterate the head till last
    //store each node in set and before sroring check if exists 
    //if yes then return true 
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast!=slow){
            slow=slow.next;
            if(fast.next!=null)fast=fast.next.next;
            else fast=fast.next;
        }
        if(slow==fast) return true;
        return false;
    }
}
