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

    ListNode ans = null;

    public void insertInAns(ListNode j) {
        if(ans == null && j!=null){
            ans = j;
            ans.next = null;
            return;
        }
        if(j!=null && ans!=null){
            ListNode temp = ans;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = j;
            j.next = null;
        }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next == null || head.next.next==null) {
            return head;
        }
        ListNode i = head;
        ListNode j = head.next;

        while(j!=null) {
            i.next = j.next;
            insertInAns(j);
            i = i.next;
            if(i!=null){
                j = i.next;
            }
            else{
                j=null;
            }
        }

        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = ans;
        return head;
    }
}
