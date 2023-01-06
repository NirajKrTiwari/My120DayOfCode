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
    public int count(ListNode head)
    {
        int c=0;
        ListNode temp=head;
        if(head==null)
            return -1;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode middleNode(ListNode head) {
        int len=count(head);
        ListNode temp=head;
        int n;
        n=len/2;
        for(int i=0;i<n;i++)
        {
            temp=temp.next;
        }
        head=temp;
        return head;
    }
}