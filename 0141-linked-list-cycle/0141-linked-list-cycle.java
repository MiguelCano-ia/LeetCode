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
        
        ListNode s = head;
        ListNode f = head;
        
        while (f != null && f.next != null) {
            if (s.next.equals(f.next.next)) {
                return true;
            } else {
                s = s.next;
                f = f.next.next;
            }
        }
        return false;
    }
}