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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return null;
        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        int mid  = count/2;
        ListNode prev=null,cur = head,post=cur.next;
        int k=0;
        while(k<mid){
            prev = cur;
            cur=cur.next;
            post = cur.next;
            k++;
        }
        prev.next=post;
        return head;
    }
}