/*
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
 

Constraints:

The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* reverseList(struct ListNode* head){
     struct ListNode* temp1=head;
     struct ListNode* temp2=NULL;
     struct ListNode* temp3;

     while(temp1!=NULL){
         temp3=temp1->next;
         temp1->next=temp2;
         temp2=temp1;
         temp1=temp3;
     }
     head=temp2;
     return head;
   
 }
int getDecimalValue(struct ListNode* head) {

    struct ListNode *temp=reverseList(head);

    int i=0;
    int sum=0;
    
    while(temp!=NULL){
        if(temp->val==1){
            sum=sum+pow(2,i);
        }
        i++;
        temp=temp->next;
    }
    
    return sum;
}
