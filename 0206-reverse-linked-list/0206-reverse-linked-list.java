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
    public ListNode reverseList(ListNode head) {
        ListNode p = head,k=null,p1=null;
        if(head==null||head.next==null)
        {
            return head;
        }
            while(p!=null)
            {
                 p1 = p.next;
                 p.next = k;
                 k=p;
                 p=p1;
            }
            return k;
    }
}