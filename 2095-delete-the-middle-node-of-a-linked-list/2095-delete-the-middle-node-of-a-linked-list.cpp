/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
        if (head == nullptr) {
            return head;
        } else if (head->next == nullptr) {
            return nullptr;
        }

        ListNode* slow = head;
        ListNode* faster = head;

        while (faster != nullptr && faster->next != nullptr) {
            slow = slow->next;
            faster = faster->next->next;
        }
        ListNode* current = head;

        while (current->next != slow) {
            current = current->next;
        }
        current->next = slow->next;

        return head;
    }
};