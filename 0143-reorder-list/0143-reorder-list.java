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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return ;
         ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        slow.next=null;
        ListNode prev = null;
        ListNode post = null;
        while(cur!=null)
        {
            post = cur.next;
            cur.next = prev;
            prev = cur;
            cur=post;
        }
        ListNode ptr = head;
        ListNode v1 = null,v2 = null;     
        while(ptr!=null&&prev!=null)
        {
            v1 = ptr.next;
            v2 = prev.next;
            ptr.next = prev;
            prev.next = v1;
            ptr = v1;
            prev=v2;
        }
    }
}