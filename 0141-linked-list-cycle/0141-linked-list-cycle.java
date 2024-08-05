/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode faster = head.next;

        while (faster.next != null && faster.next.next != null) {
            slow = slow.next;
            faster = faster.next.next;

            if (slow == faster) {
                return true;
            }
        }
        return false;
    }
}