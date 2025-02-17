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
        Map<Node, Node> nodesMap = new HashMap<>();
        nodesMap.put(null, null);

        Node curr = head;
        while (curr != null) {
            nodesMap.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            Node copy = nodesMap.get(curr);
            copy.next = nodesMap.get(curr.next);
            copy.random = nodesMap.get(curr.random);
            curr = curr.next;
        }
        return nodesMap.get(head);
    }
}