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

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> h = new HashMap<>();
Node temp = head;
Node result = new Node(0);
Node dummy = result;

while (temp != null) {
    Node newNode = new Node(temp.val);
    dummy.next = newNode;
    temp = temp.next;
    dummy = dummy.next;
}

temp = head;
dummy = result.next;

while (temp != null) {
    h.put(temp, dummy);
    temp = temp.next;
    dummy = dummy.next;
}

temp = head;
dummy = result.next;

while (dummy != null) {
    if (temp.random == null) dummy.random = null;
    else {
        dummy.random = h.get(temp.random);
    }
    dummy = dummy.next;
    temp = temp.next;
}

return result.next;

    }
}