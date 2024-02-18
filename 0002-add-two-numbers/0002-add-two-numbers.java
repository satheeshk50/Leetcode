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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode m = l1,n = l2;
        ListNode r = null,head=new ListNode(0);
        ListNode temp = head;
        int carry =0;
        int sum =0;
        // if(m!=null&&n!=null)
        // {
        //     sum = m.val+n.val;
        //     if()
        //     r = new ListNode(sum);
        // }
        while(m!=null||n!=null||carry!=0)
        {
            int d1 = 0;
            int d2 = 0;
            if(m!=null)
            {
                d1 = m.val;
            }
            if(n!=null)
            {
                d2 = n.val;
            }
            sum = carry+d1+d2;
            int rem = sum%10;
            carry = sum/10;
            r = new ListNode(rem);
            temp.next = r;
            temp = r;
            if(m!=null)
            {
            m = m.next;
            }
            if(n!=null){
            n = n.next;
            }

        }
        return head.next;
    }
}