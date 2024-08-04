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
    public ListNode reverseList(ListNode head) {
        ListNode temp2 = null;
        ListNode temp = head;

        if (head == null || head.next == null) {
            return head;
        }

        while(temp != null) {
            temp = temp.next;
            head.next = temp2;
            temp2 = head;

            if (temp != null) {
                head = temp;
            }
        }

        return head;
    }
}