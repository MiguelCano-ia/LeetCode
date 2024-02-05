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
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null) {
            return head;
        }

        int cont = 0;
        int length = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        if (length < k) {
            k %= length;
        }

        while (cont != k) {
            ListNode prev = head;

            while (prev.next != tail) {
                prev = prev.next;
            }

            tail.next = head;
            prev.next = null;
            head = tail;
            tail = prev;
            cont++;
        }

        return head;
    }
}