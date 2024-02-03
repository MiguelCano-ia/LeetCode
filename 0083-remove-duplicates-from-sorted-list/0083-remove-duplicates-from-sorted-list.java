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
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        ListNode temp2 = head;

        while(temp != null) {
            if (temp.next == null) {
                temp2.next = null;
                return  head;
            }
            if (temp.val == temp.next.val) {
                temp = temp.next;
            } else {
                temp = temp.next;
                temp2.next = temp;
                temp2 = temp;
            }
        }
        return head;
    }
}