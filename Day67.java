Given two sorted linked lists consisting of n and m nodes respectively. The task is to merge both of the lists and return the head of the merged list.

Example:

Input: 

1
 

Output: 

3


Input:

1
 


Output: 

4
 
Approach:

The idea is to iteratively merge two sorted linked lists using a dummy node to simplify the process. A current pointer tracks the last node of the merged list. We compare the nodes from both lists and append the smaller node to the merged list. Once one list is fully traversed, the remaining nodes from the other list are appended. The merged list is returned starting from the node after the dummy node.

Below is the working of above approach:

Merge-two-sorted-lists-1.webpMerge-two-sorted-lists-1.webp


Below is the implementation of above approach:

// Java program to merge two sorted linked 
// lists iteratively
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {

    // Function to merge two sorted linked 
    // lists iteratively
    static Node sortedMerge(Node head1,
                                       Node head2) {

        // Create a dummy node to simplify 
        // the merging process
        Node dummy = new Node(-1);
        Node curr = dummy;

        // Iterate through both linked lists
        while (head1 != null && head2 != null) {
          
            // Add the smaller node to the merged list
            if (head1.data <= head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        // If any list is left, append it to 
        // the merged list
        if (head1 != null) {
            curr.next = head1;
        } else {
            curr.next = head2;
        }

        // Return the merged list starting from 
        // the next of dummy node
        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // First linked list: 5 -> 10 -> 15 -> 40
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        // Second linked list: 2 -> 3 -> 20
        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        Node res = sortedMerge(head1, head2);
        printList(res);
    }
}

Output
2 3 5 10 15 20 40
Time Complexity: O(n + m), where n and m are the length of head1 and head2 respectively.
Auxiliary Space: O(1)

Related article:

Merge two sorted linked lists