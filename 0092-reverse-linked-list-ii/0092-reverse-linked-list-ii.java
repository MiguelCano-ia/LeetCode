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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevCurrent = dummy;
        ListNode current = head;

        for (int i = 0; i < left - 1; i++) {
            prevCurrent = prevCurrent.next;
            current = current.next;
        }

        ListNode current2 = current;
        ListNode prev = null;

        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        current2.next = current;
        prevCurrent.next = prev;

        return dummy.next;
    }
}