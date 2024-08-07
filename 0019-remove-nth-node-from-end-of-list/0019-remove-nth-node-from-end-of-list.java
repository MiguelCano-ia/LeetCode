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
        ListNode temp = head;
        ListNode temp2 = head;

        if (head == null || head.next == null) {
            return null;
        }

        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int stop = count - n;

        if (stop == 0) {
            ListNode dummy = new ListNode();
            dummy.next = temp2.next;
            return  dummy.next;
        }

        for (int i = 0; i < stop - 1; i++) {
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;

        return head;
    }
}