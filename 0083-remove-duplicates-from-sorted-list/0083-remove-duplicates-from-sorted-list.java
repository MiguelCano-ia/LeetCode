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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode current2 = head.next;

        while (current2 != null) {
            if (current.val == current2.val) {
                current2 = current2.next;
            } else {
                current.next = current2;
                current = current2;
                current2 = current2.next;
            }
        }
        current.next = current2;

        return head;
    }
}