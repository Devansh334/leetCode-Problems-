/*
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 

Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
*/


int count(struct ListNode* temp){
    int count=0;
    
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    return count;
}
void reorderList(struct ListNode* head) {
    if(head==NULL || head->next==NULL){
        return;
    }
    int n=count(head);
    
    struct ListNode *last = head;
    while(last->next!=NULL){
        last=last->next;
    }

    struct ListNode *temp=head;
    for(int i=1;i<=n/2;i++){
        struct ListNode *foo=head;
        while(foo->next!=last){
            foo=foo->next;
        }
        struct ListNode *ptr=temp->next;
        temp->next=last;
        last->next=ptr;
        last=foo;
        temp=ptr;

    }

    temp->next=NULL;

}
