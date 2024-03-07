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
    public int pairSum(ListNode head) {
        int len = 0;
        ListNode ptr = head;
        while(ptr!=null)
        {
            len++;
            ptr=ptr.next;
        }
        int arr[] = new int[len];
        int i=0;
        ptr=head;
        while(ptr!=null)
        {
            arr[i++] = ptr.val;
            ptr=ptr.next;
        }
        int maxscore = 0;
        for(int j=0;j<len/2;j++)
        {
            int temp = arr[j]+arr[len-1-j];
            maxscore = Math.max(temp,maxscore);
        }
        return maxscore;
    }
}