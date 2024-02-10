/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode* slow = head;
        ListNode* faster = head;

        while (faster != nullptr && faster->next != nullptr) {
            slow = slow->next;
            faster = faster->next->next;

            if (slow == faster) {
                return true;
            }
        }

        return false;
    }
};