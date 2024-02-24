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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode ptr = head;
        // ListNode p = head;
        // int count = 0;
        // if(head==null)
        // {
        //     return head;
        // }
        // while(ptr!=null)
        // {
        //     count++;
        //     ptr = ptr.next;
        // }
        // int k = count-n+1;
        // int j = 1;
        // while(p!=null&&n!=0)
        // {
        //     j++;
        //     if(j==k)
        //     {
        //         break;
        //     }
        //     p = p.next;
        // }
        // p.next=p.next.next;
        // return head;
         ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}