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
    public boolean isPalindrome(ListNode head) {
        // long n = 0;
        // ListNode temp = head;
        // while(temp!=null)
        // {
        //     n = n*10+temp.val;
        //     temp = temp.next;
        // }
        // String s = String.valueOf(n);
        // int j=s.length()-1;
        // for(int i=0;i<s.length()/2;i++)
        // {
        //     if(s.charAt(i)!=s.charAt(j--))
        //     {
        //         return false;
        //     }
        // }
        // return true;
        ListNode slow = head, fast = head, prev, temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
}