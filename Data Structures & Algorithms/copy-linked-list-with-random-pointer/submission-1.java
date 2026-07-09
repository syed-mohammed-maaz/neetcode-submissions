/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

//1.first iterate the original and create new LL which has vals and next pointers and at the 
//
//2.Create a hashmap now with key and value as node
class Solution {
    public Node copyRandomList(Node head) {

        Map<Node,Node> h=new HashMap<>();
        Node dummy=new Node(0);
        
        Node temp1=head,temp2=dummy;

        while(temp1!=null){
           
            Node newNode=new Node(temp1.val);
            temp2.next=newNode;
            temp2=temp2.next;
            h.put(temp1,temp2);//store the nodes in map
            temp1=temp1.next;
           
        }

        temp1=head;
        temp2=dummy.next;
        while(temp1!=null){
            temp2.random=h.get(temp1.random);
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return dummy.next;











//         HashMap<Node, Node> h = new HashMap<>();
// Node temp = head;
// Node result = new Node(0);
// Node dummy = result;

// while (temp != null) {
//     Node newNode = new Node(temp.val);
//     dummy.next = newNode;
//     temp = temp.next;
//     dummy = dummy.next;
// }

// temp = head;
// dummy = result.next;

// while (temp != null) {
//     h.put(temp, dummy);
//     temp = temp.next;
//     dummy = dummy.next;
// }

// temp = head;
// dummy = result.next;

// while (dummy != null) {
//     if (temp.random == null) dummy.random = null;
//     else {
//         dummy.random = h.get(temp.random);
//     }
//     dummy = dummy.next;
//     temp = temp.next;
// }

// return result.next;

    }
}