/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    public Node rotate(Node head, int k) {
        // add code hereint 
        int len = 1;
        if(head ==null || k ==0){
            return head;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
            len++;
        }
        k =k%len;
        if(k==0){
            return head;
        }
        curr.next = head;
        curr = head;
        for(int i=1;i<k;i++){
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}