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
    public void reorderList (ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = getMid(head);
        ListNode head2 = reverseList(mid);

        ListNode current = head;
        ListNode current2 = head2;

        while (current != null && current2 != null) {
            ListNode temp = current.next;
            current.next = current2;
            current = temp;

            ListNode temp1 = current2.next;
            current2.next = current;
            current2 = temp1;
        }

        if (current != null) {
            current.next = null;
        }
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode faster = head;

        while (faster != null && faster.next != null) {
            slow = slow.next;
            faster = faster.next.next;
        }

        return slow;
    }

    private ListNode reverseList(ListNode mid) {
        ListNode prev = null;
        ListNode current = mid;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}