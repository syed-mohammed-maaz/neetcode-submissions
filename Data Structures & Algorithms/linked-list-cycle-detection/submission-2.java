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
    //Fast and Slow pointers 
    /**
    1.set slow and fast pointers 
    2.slow will increase by 1 and fast will increase 2
    3.iterate till fast is not null and its not equal to slow
    4.for each iteration if slow =slow.next and
    if fast.next is not equal to null then do increment by 2 else 
    increment by 1 to avoid null pointer exception
    */
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
