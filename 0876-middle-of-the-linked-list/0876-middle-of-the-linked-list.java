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
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode s = head;
        ListNode f = head;

        while (f != null) {
            if (f.next == null) {
                return s;
            } else {
                s = s.next;
                f = f.next.next;
            }
        }

        return s;
    }
}