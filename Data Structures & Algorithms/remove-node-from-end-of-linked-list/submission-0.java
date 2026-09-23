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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = countNodes(head);

        if (count == n) return head.next;

        ListNode curr = head;
        for (int i = 0; i < count - n - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public int countNodes(ListNode head) {
        int count = 0;
        ListNode curr = head;

        while ( curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }
}
