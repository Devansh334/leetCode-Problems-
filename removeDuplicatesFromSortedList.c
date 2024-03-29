/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    
    if(head==NULL){
        return NULL;
    }

    struct ListNode *temp=head;
    struct ListNode *temp2=head;

    while(temp->next!=NULL){
        struct ListNode *ptr=NULL;
        temp2=temp;
        temp=temp->next;

        if(temp->val==temp2->val){
            temp2->next=temp->next;
            ptr=temp;
            temp=temp2;
            free(ptr);
        }
    }
    return head;
}
