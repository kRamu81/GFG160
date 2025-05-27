class Solution {
    Node reverseList(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;  // store next
            head.next = prev;       // reverse current
            prev = head;            // move prev
            head = next;            // move ahead
        }
        return prev;  // new head
    }
}