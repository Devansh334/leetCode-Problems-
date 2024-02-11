/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 


*/


/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

int count(struct ListNode* head)
{
    int i=0;
    struct ListNode* temp=head;
    while(temp!=NULL){
        i++;
        temp=temp->next;
    }
    return i;
}
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if(head==NULL||head->next==NULL){
        return NULL;
    }

    int i=count(head)-n;
    int j=0;
    if(i==0){
        struct ListNode *ptr=head;
        head=head->next;
        free(ptr);
        return head;
    }
    struct ListNode *temp=head;
    struct ListNode *temp2=head;
    while(j<i){
        temp2=temp;
        temp=temp->next;
        j++;
    }
    temp2->next=temp->next;
    free(temp);
    return head;
}
