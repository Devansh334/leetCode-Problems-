/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
  
     if(head==NULL){
        return NULL;
    }

    

    
    
    while( head!=NULL && head->val==val ){
    
    struct ListNode *temp=head;
    head=head->next;
    free(temp);
    }
    if(head==NULL){
        return NULL;
    }


    struct ListNode *temp=head;
    struct ListNode *temp2=head;
    while( temp->next!=NULL ){
        temp2=temp;
        temp=temp->next;
        if(temp->val==val){
            temp2->next=temp->next;
            free(temp);
            temp=temp2;
        }
    }
    if(temp->val==val){
        free(temp);
    }
      
  return head;
}
