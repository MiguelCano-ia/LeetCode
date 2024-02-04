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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();

        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode temp = list1;
        ListNode temp2 = list2;
        ListNode result = head;

        while(temp != null && temp2 != null) {
            if (temp.val < temp2.val) {
                result.next = new ListNode(temp.val);
                temp = temp.next;
            } else {
                result.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            }
            result = result.next;
        }

        while (temp != null) {
            result.next = new ListNode(temp.val);
            temp = temp.next;
            result = result.next;
        }

        while (temp2 != null) {
            result.next = new ListNode(temp2.val);
            temp2 = temp2.next;
            result = result.next;
        }

        return head.next;
    }

    public ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}