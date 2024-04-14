/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* Ins(struct ListNode* head , int val)
{
    struct ListNode *temp =(struct ListNode*)malloc(sizeof(struct ListNode)); 
    temp->val=val;
    if(head==NULL){
        temp->next=NULL;
        head=temp;
    }
    else{
        struct ListNode *ptr = head;
        while(ptr->next!=NULL){
            ptr=ptr->next;
        }
        ptr->next=temp;
        temp->next=NULL;
    }
    return head;
}
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {

    struct ListNode* newHead=NULL;
    

    while(list1!=NULL && list2!=NULL){
        if(list1->val < list2->val){
           newHead= Ins(newHead , list1->val);
           list1=list1->next;
        }
        else{
           newHead= Ins(newHead , list2->val);
           list2=list2->next;
        }
    }

    while(list1!=NULL){
         newHead=Ins(newHead , list1->val);
           list1=list1->next;
    }

    while(list2!=NULL){
       newHead=  Ins(newHead , list2->val);
           list2=list2->next;
    }

    return newHead;
}
